package org.fasttrackit;

import org.fasttrackit.domain.User;
import org.fasttrackit.service.UserService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Vehicle[] competitors = new Vehicle[10];

    private UserService userService = new UserService();
    private List<Vehicle> competitorsList = new ArrayList<>();
    private Track track;
    public void addCompetitor(int index) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Golf");
        // interacting with a specific position from the array
        competitors[index] = vehicle;  // we add index just not to make specific to one value in the array... just like a constructor for the array

        System.out.println(competitors[0]);
    }
    public void addCompetitorsToList(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Golf");

        //adding something to the list
        competitorsList.add(vehicle);

        User user = new User();
        user.setName(vehicle.getName());
        userService.createUser(user);

    }

    public void start() throws Exception {
        addCompetitor(0);
        addCompetitor(1);

        addCompetitorsToList();
        addCompetitorsToList();

        //printWelcomeMessage();
        // Default track but you can let the user decide what track to use
        track = new Track();
        track.setName("Default Track");
        track.setLength(100);

        int numberOfPlayers = getPlayerCountFromUser();
        printWelcomeWithEnhancedFor();

        printWelcomeMessageFromList();
        boolean noWinnerYet = true;
        int roundNumber = 1;

//        do {
//            // with do-while you are sure that the 'do' block is executed at least once
//            System.out.println("Message to be repeated");
//        } while (noWinnerYet)

        while (noWinnerYet) {
            System.out.println("Round " + roundNumber);
            for (Vehicle vihicle : competitorsList) {
                double speed = getAccelerationSpeedFromUser();
                vihicle.accelerate(speed);

                if (vihicle.getTravelDistance() >= track.getLength()) {
                    System.out.println("Congrats! Vehicle " + vihicle.getName() + " won the rece !");
                    noWinnerYet = false;
                    break;
                }
            }
            roundNumber++;
        }

    }

    private void printWelcomeMessage() {
        // for loop made of 3 competitors:
        // initialization, exit condition (termination), increment
        for(int i = 0; i < competitors.length; i++) {
            // make sure to avoid NPE(NullPointerException)
            // When the array is created, all positions are populated by default with null values
            if(competitors[i] != null) {
                System.out.println("Welcome, " + competitors[i].getName());
            }
        }
    }

    private void printWelcomeMessageFromList() {
        // for loop work exactly the same with lists and with arrays
        // the focus here are on the size() and get() methods
        for(int i = 0; i < competitorsList.size(); i++) {
            // make sure to avoid NPE(NullPointerException)
            // When the array is created, all positions are populated by default with null values
            if(competitors[i] != null) {
                System.out.println("Welcome, " + competitorsList.get(i).getName());
            }
        }
    }

    private void printWelcomeWithEnhancedFor() {
        // enhanced for (or foreach)
        // implicit protection against IndexOutOfBounds exceptions and infinite loops
        for (Vehicle vehicle : competitors) {
            if (vehicle != null) {
                System.out.println("Enhanced Welcome, " + vehicle.getName());
            }
        }
    }

    private int getPlayerCountFromUser() throws Exception {
        System.out.println("Please enter the number of players... We beg of thee");
        // user's input from the keyboard
        Scanner scanner = new Scanner(System.in);

        int userInput=0;
         try       {
             userInput = scanner.nextInt();
             // we can have as many catch blocsks as we want
         }catch (NullPointerException exception) {
             System.out.println("test");

             // example of throwing a checked and declaring it in the method signature
             throw new Exception("We don't tolerate NOEs");
         }
         // example of recursion (a method callng itself)
         catch (InputMismatchException exception) {
             System.out.println("Please enter a valid integer number.");
             userInput = getPlayerCountFromUser();
         } // finally block is optional and will always be executed at the end
        finally {
             System.out.println("Someting will always happen...");
         }

        System.out.println("Your selected number of players: " + userInput);

        return userInput;
    }
    private double getAccelerationSpeedFromUser(){
        System.out.println("Please enter the acceleration speed.");
        Scanner scanner = new Scanner(System.in);
        double userinput;

        try {
            userinput = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid value, please try again...");
            userinput = getAccelerationSpeedFromUser();
        }
        System.out.println("You entered: " + userinput);
        return userinput;

    }
}

package org.fasttrackit.persistance;

import org.fasttrackit.domain.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {

    // Only this class is going to be the only connection between the app with the database

    public User createUser(User user) {
        // when using reserved sql keywords, surround them with `
        String insertQuery = "INSERT INTO users (`name`, wonRaces) " +
                "VALUES ('" + user.getName() + "', " + user.getWonRaces() + ");";

//        try(Connection connection = DatabaseConfiguration.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(insertQuery)
//        ) {
//
//            if(resultSet.next()){
//                // creating a new user object so we make sure we return what we actually stored in the db, not what we received as a request
//                User savedUser = new User();
//                savedUser.setId(resultSet.getLong("id"));
//                savedUser.setName(resultSet.getString("name"));
//                savedUser.setWonRaces(resultSet.getInt("wonRaces"));
//
//                return savedUser;
//            }

        try (Connection connection = DatabaseConfiguration.getConnection();
             // todo: statement will be replaced by PrepareStatement
             Statement statement = connection.createStatement();) {
            int savedId = statement.executeUpdate(insertQuery);
            user.setId(savedId);
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

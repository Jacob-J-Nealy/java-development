import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataManager {

    // Properties
    private BasicDataSource dataSource;

    // Constructor
    public DataManager(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Actor getActorByName(String lastName) {

        // Null Object
        Actor actor = null;

        // Execute query to retrieve actors with the provided last name
        String actorsQuery = """
                SELECT first_name, last_name 
                FROM actor 
                WHERE last_name = ?""";

        try (Connection connection = dataSource.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            try (PreparedStatement actorsStatement = connection.prepareStatement(actorsQuery)) {
                actorsStatement.setString(1, lastName);

                try (ResultSet actorsResult = actorsStatement.executeQuery()) {
                    if (actorsResult.next()) {
                        System.out.println("Your matches are: \n");
                        do {
                            String firstName = actorsResult.getString("first_name");
                            lastName = actorsResult.getString("last_name");
                            System.out.println(firstName + " " + lastName);

                            actor = new Actor(firstName, lastName);

                        } while (actorsResult.next());

                    } else {
                        System.out.println("No matches!");
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return actor;
    }

    public void getFilmsByActorId() {
    }

    // Extra
    public void searchMovieByActorId () {
    }




}
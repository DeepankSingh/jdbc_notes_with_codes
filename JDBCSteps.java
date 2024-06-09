import java.sql.*;

// Steps for JDBC
// Step 1: Import Packages (adding the jar file to IDE)
// Step 2: Load Driver (optional)
// Step 3: Register Driver (optional)
// Step 4: Create Connection
// Step 5: Create Statement
// Step 6: Execute the Statement
// Step 7: Close the Connection

public class JDBCSteps {
    public static void main(String[] args) {

        // SQL query to be executed
        String sql = "SELECT FirstName FROM employee WHERE EmployeeID = 3";

        // Database connection URL, username and password
        String url = "jdbc:postgresql://localhost:5432/test"; // URL for PostgreSQL database named 'test' on localhost
        String username = "yourDatabaseUserName"; // Replace with your Database username
        String password = "yourpassword"; // Replace with your Database password

        // Step 4: Create Connection
        // Using try-with-resources to ensure the Connection is closed automatically
        try (Connection con = DriverManager.getConnection(url, username, password)) {

            // Step 5: Create Statement
            // Use Statement for executing simple SQL queries without parameters.
            try (Statement st = con.createStatement()) {

                // Step 6: Execute the Statement
                // Execute the query and get a ResultSet
                try (ResultSet rs = st.executeQuery(sql)) {

                    // Move the cursor to the next row of the ResultSet
                    if (rs.next()) {
                        // Retrieve the value of the first column in the current row
                        String name = rs.getString(1);
                        // Print the result
                        System.out.println(name);
                    } else {
                        System.out.println("No data found for EmployeeID = 3");
                    }
                } catch (SQLException e) {
                    // Handle any SQL exceptions that occur during query execution
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                // Handle any SQL exceptions that occur while creating the Statement
                e.printStackTrace();
            }

        } catch (SQLException e) {
            // Handle any SQL exceptions that occur while creating the Connection
            e.printStackTrace();
        }

        // Steps 4 to 7 are complete within the try-with-resources blocks

        // Summary of JDBC interfaces:
        // Statement -> Use Statement for executing simple SQL queries without parameters.
        // PreparedStatement -> Use PreparedStatement to execute parameterized queries and prevent SQL injection attacks.
        // CallableStatement -> Use CallableStatement to execute stored procedures and functions in the database.
    }
}

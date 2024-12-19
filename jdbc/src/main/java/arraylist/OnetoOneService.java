package arraylist;

import insertintojdbc.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OnetoOneService {
    public void insertEmp(AddressEntity1 addressEntity1) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "root");

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO address_latest(id, name, state, city) VALUES(?,?,?,?)"
            );

            preparedStatement.setInt(1, addressEntity1.getId());
            preparedStatement.setString(2, addressEntity1.getCity());

            preparedStatement.setString(4, addressEntity1.getState());


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Insert is successful...");
            } else {
                System.out.println("Insert failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

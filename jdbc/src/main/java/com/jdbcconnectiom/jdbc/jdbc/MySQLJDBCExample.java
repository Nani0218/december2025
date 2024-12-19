package com.jdbcconnectiom.jdbc.jdbc;

import com.jdbcconnectiom.jdbc.JdbcProject;

import java.sql.*;
import java.util.*;

public class MySQLJDBCExample {


    public static Collection<JdbcProject> getEmpAllocation() {
        Collection<JdbcProject> jdbcProjects = new ArrayList<>();

        Map<Integer, JdbcProject> employeeProjectMap = new HashMap<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "root");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from employee");
            while (resultSet.next()) {

                System.out.println(" project Name " + resultSet.getString(2) + " Employee name : " + resultSet.getString(2));


                if (employeeProjectMap.containsKey(resultSet.getString(2) + " Employee name : " + resultSet.getString(2))) {
                    JdbcProject jdbcProject = employeeProjectMap.get(resultSet.getString(2));
                    JdbcEmployee employee = new JdbcEmployee();
                    employee.setName(resultSet.getString("name"));
                    jdbcProject.getEmployeList().add(employee);
                } else {
                    JdbcProject jdbcProject = new JdbcProject();
                    jdbcProject.setId(resultSet.getInt(2));
                    List<JdbcEmployee> jdbcEmployees = new ArrayList<>();
                    jdbcProject.setEmployeList(jdbcEmployees);

                    jdbcProject.setName(resultSet.getString(2));

                    JdbcEmployee employee = new JdbcEmployee();
                    employee.setName(resultSet.getString("name"));
                    jdbcEmployees.add(employee);

                    employeeProjectMap.put(Integer.valueOf(resultSet.getString(2)), jdbcProject);

                }

                int id = resultSet.getInt("id");
                double salary = resultSet.getDouble("salary");
                String name = resultSet.getString("name");
                System.out.println("Employee ID: " + id + ", Salary: " + salary + "   name : " + name);
            }
            connection.close();
        } catch (Exception e) {

            System.out.println(" Exception occured fetching "+e);

        }
        return jdbcProjects;
    }
}
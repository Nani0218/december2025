package jion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelfJoin {

        public Map<String, List<Emp>> selfJoin() {

            Map<String, List<Emp>> map = new HashMap<>();

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee", "root", "root");

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT e.*,m.name FROM employee.emp e,employee.emp m where e.managerid=m.empid;");

                while (resultSet.next()) {

                    System.out.println("emp name " + resultSet.getString(2) + " mang name " + resultSet.getString(8));


                    if (map.containsKey(resultSet.getString(8))) {

                        List<Emp> emp = map.get(resultSet.getString(8));
                        Emp emp1 = new Emp();
                        emp1.setName(resultSet.getString(2));
                        emp.add(emp1);
                        map.put(resultSet.getString(8), emp);

                    } else {

                        List<Emp> emps = new ArrayList<>();
                        Emp emp = new Emp();
                        emp.setName(resultSet.getString(2));
                        emps.add(emp);
                        map.put(resultSet.getString(8), emps);

                    }
                }
            } catch (Exception e) {

                System.out.println("exception");

            }

            System.out.println(map.keySet());

            return map;
        }

    }


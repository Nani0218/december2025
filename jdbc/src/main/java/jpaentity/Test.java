package jpaentity;
//
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;

import java.util.List;

public class Test {
     public static void main(String[] args) {
         EmployeeService service = new EmployeeService();
         List<ProjectEntity> project = service.nplusone();

         for (ProjectEntity projects : project) {


             System.out.println(projects);
              projects.getEmployeeEntityList().forEach(emp -> System.out.println("           "+emp));
         }

         List<EmployeeEntity> amount=service.getEmployeesWithSalaryAboveThreshold();

         for (EmployeeEntity amount1:amount){
             System.out.println("    Salary above 20000 employees:    "+amount1);

         }



















//         List<ProjectEntity> nplusone=
//         service.nplusone();
//            for (ProjectEntity project1:nplusone){
//                System.out.println("mm");
//                System.out.println(project1);
//            }
//
//     }
     }

    }


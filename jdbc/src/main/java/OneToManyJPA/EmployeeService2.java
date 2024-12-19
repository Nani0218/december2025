//package OneToManyJPA;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.Query;
//import jpaentity.EmployeeEntity;
//import jpaentity.ProjectEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class EmployeeService2 {
//    public List<ProjectEntity> project(){
//
//        return getProjectDataAndEmp();
//    }
//
//
//    public void  saveJpa(List<Project1>project1List){
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//
//        ProjectEntity2 projectEntity2=new ProjectEntity2();
//
//        projectEntity2.setName(projectEntity2.getName());
//        projectEntity2.setStartDate(projectEntity2.getStartDate());
//        projectEntity2.setEndDate(projectEntity2.getEndDate());
//
//        List<EmployeeEntity2>employeeEntity2=new ArrayList<>();
//
//        for (int i=0;i<project1List.size();i++){
//            EmployeeEntity2 employeeEntity =new EmployeeEntity2();
//            employeeEntity.setName(employeeEntity.getName());
//            employeeEntity.setId(employeeEntity.getId());
//            employeeEntity.setDept(employeeEntity.getDept());
//            employeeEntity.setSalary(employeeEntity.getSalary());
//            employeeEntity.setProjectEntity(employeeEntity.getProjectEntity());
//
////            employeeEntity2.add();
//
//
//
//        }
//    }
//
//    public List<EmployeeEntity> getEmployeesData() {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select p from EmployeeEntity p");
//        List<EmployeeEntity> resultList = query.getResultList();
//
//        entityManager.getTransaction().commit();
//
//        return resultList;
//    }
//    public List<ProjectEntity> getProjectDataAndEmp() {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        Query query = entityManager.createQuery("select p from ProjectEntity p inner join EmployeeEntity e on p.proId=e.project");
//
//        List<ProjectEntity> resultList = query.getResultList();
//
//        entityManager.getTransaction().commit();
//
//        for (ProjectEntity p:resultList){
//            System.out.println(p.getName());
//            System.out.println(p.getEmployeeEntityList());
//        }
//
//        return resultList;
//    }
//
//    public List<ProjectEntity> selfJoinOnEmp() {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        Query query = entityManager.createQuery("SELECT e.name,m FROM EmployeeEntity e,EmployeeEntity m where e.managerid=m.empid");
//
//        List<ProjectEntity> resultList = query.getResultList();
//
//        entityManager.getTransaction().commit();
//
//        for (ProjectEntity p:resultList){
//            System.out.println(p.getName());
//            // System.out.println(p.getEmployeeEntityList());
//        }
//
//        return resultList;
//    }
//
//    public List<ProjectEntity> nplusone() {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//
//Query query=entityManager.createQuery("select p from ProjectEntity p inner join p.employeeEntityList");
//List<ProjectEntity>projectEntities=query.getResultList();
//entityManager.getTransaction().commit();
//        System.out.println(projectEntities.size());
//
//        return projectEntities;
//    }
//
//    public List<EmployeeEntity> getEmployeesWithSalaryAboveThreshold() {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        // Use a named parameter in the query
//        Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e WHERE e.salary > :salary");
//        query.setParameter("salary", 20000);
//
//        List<EmployeeEntity> resultList = query.getResultList();
//
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        entityManagerFactory.close();
//
//        return resultList;
//    }
//
//
//}

package jpaentity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;


public class EmployeeService {
    public List<ProjectEntity> project(){

        return getProjectDataAndEmp();
    }

    public List<EmployeeEntity> getEmployeesData() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select p from EmployeeEntity p");
        List<EmployeeEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        return resultList;
    }
    public List<ProjectEntity> getProjectDataAndEmp() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p from ProjectEntity p inner join EmployeeEntity e on p.proId=e.project");

        List<ProjectEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        for (ProjectEntity p:resultList){
            System.out.println(p.getName());
            System.out.println(p.getEmployeeEntityList());
        }

        return resultList;
    }

    public List<ProjectEntity> selfJoinOnEmp() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("SELECT e.name,m FROM EmployeeEntity e,EmployeeEntity m where e.managerid=m.empid");

        List<ProjectEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        for (ProjectEntity p:resultList){
            System.out.println(p.getName());
            // System.out.println(p.getEmployeeEntityList());
        }

        return resultList;
    }

    public List<ProjectEntity> nplusone() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();


Query query=entityManager.createQuery("select p from ProjectEntity p inner join p.employeeEntityList");
List<ProjectEntity>projectEntities=query.getResultList();
entityManager.getTransaction().commit();
        System.out.println(projectEntities.size());

        return projectEntities;
    }

    public List<EmployeeEntity> getEmployeesWithSalaryAboveThreshold() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        // Use a named parameter in the query
        Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e WHERE e.salary > :salary");
        query.setParameter("salary", 20000);

        List<EmployeeEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        return resultList;
    }


}

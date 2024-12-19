package arraylist;

import jakarta.persistence.*;



public class OneToOneTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();



               try {



            em.getTransaction().begin();

            PersonEntity1 person = new PersonEntity1();
            person.setName("nani");
            person.setAddress("KPHB  7TH PHASE");


            AddressEntity1 address = new AddressEntity1();
            address.setCity("hyd");
            address.setState("TG");


            person.setAddressenity(address);
            address.setPerson(person);


            em.persist(person);
            em.persist(address);

            em.getTransaction().commit();

            System.out.println("Person and Address successfully saved!");


            em.getTransaction().begin();
            PersonEntity1 fetchedPerson = em.find(PersonEntity1.class, person.getPid());
            if (fetchedPerson != null) {
                System.out.println("person Person Name: " + fetchedPerson.getName());
                System.out.println("person Address City: " + fetchedPerson.getAddressenity().getCity());
                System.out.println("person Address State: " + fetchedPerson.getAddressenity().getState());

            }
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}

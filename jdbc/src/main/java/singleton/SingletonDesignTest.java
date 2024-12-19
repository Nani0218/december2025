package singleton;


public class SingletonDesignTest {



        public static void main(String[] args) {

            LibraryManager libraryManager1 = LibraryManager.getInstance();


            libraryManager1.displayLibraryDetails();

            LibraryManager libraryManager2 = LibraryManager.getInstance();



            if (libraryManager1 == libraryManager2) {

                System.out.println("HashCode for libraryManager1: " + libraryManager1.hashCode());
                System.out.println("Singleton works instance.");
            } else {
                System.out.println("Singleton failed.");
            }

            libraryManager1.setLibraryName("Downtown Library");
            libraryManager1.displayLibraryDetails();


            System.out.println("HashCode for libraryManager2: " + libraryManager2.hashCode());

        }
    }

package singleton;

public class LibraryManager {

        private static LibraryManager singleInstance;
    private String libraryName;
    private String[] bookCollection;

    private LibraryManager() {
        this.libraryName = "Central Library";
        this.bookCollection = new String[] { "The Great man", "How To Kill a person", "1984", "mother's love", "inspiration" };
        System.out.println("LibraryManager created.");
    }

    public static LibraryManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new LibraryManager();
        }
        return singleInstance;
    }

    public static void setSingleInstance(LibraryManager singleInstance) {
        LibraryManager.singleInstance = singleInstance;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBookCollection(String[] bookCollection) {
        this.bookCollection = bookCollection;
    }

    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Collection:");
        for (String book : bookCollection) {
            System.out.println(book);
        }
    }
}

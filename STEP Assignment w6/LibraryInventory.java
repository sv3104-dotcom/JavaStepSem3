class LibraryInventory {
    String title;
    String author;
    int copiesAvailable;

    LibraryInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " +
                           copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        LibraryInventory[] books = {
            new LibraryInventory("Clean Code", "Robert C. Martin", 3),
            new LibraryInventory("Effective Java", "Joshua Bloch", 5),
            new LibraryInventory("Refactoring", "Martin Fowler", 0),
            new LibraryInventory("Design Patterns", "GoF", 2)
        };

        for (LibraryInventory book : books) {
            book.printEntry();
        }
    }
}
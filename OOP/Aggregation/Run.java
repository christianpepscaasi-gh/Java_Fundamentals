public class Run {
    public static void main(String[] args) {

//        Aggregation = Represents a "has-a" relationship between object
//                One Object contains another object as part of its structure
//                But contained object/s can exist independently

        Book book1 = new Book("Book 1", 423);
        Book book2 = new Book("Book 2", 15);
        Book book3 = new Book("Book 3", 50);

        Book[] books = {book1, book2, book3};

        Library library = new Library("MPL", 1900, books);
        library.displayInfo();
    }
}
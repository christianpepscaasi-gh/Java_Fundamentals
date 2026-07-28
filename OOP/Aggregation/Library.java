public class Library {
    String name;
    int year;

    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);

        System.out.println("Books: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
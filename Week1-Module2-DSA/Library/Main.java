package library;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Java", "James Gosling"),
                new Book(103, "Python", "Guido van Rossum"),
                new Book(104, "Data Structures", "Mark Allen"),
                new Book(105, "Operating System", "Galvin")

        };

        System.out.println("===== Linear Search =====");

        Book b1 = LibraryManagementSystem.linearSearch(books, "Python");

        if (b1 != null)
            System.out.println(b1);
        else
            System.out.println("Book Not Found");

        System.out.println("\n===== Binary Search =====");

        Book b2 = LibraryManagementSystem.binarySearch(books, "Java");

        if (b2 != null)
            System.out.println(b2);
        else
            System.out.println("Book Not Found");
    }
}

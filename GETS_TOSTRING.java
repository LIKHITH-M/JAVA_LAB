// 2. Create a class Book which contains four members: name, author, price, num
// of pages. Include a constructor to set the values for the members. Include
// methods to set and get the details of the objects. Include a toString() method
// that could display the complete details of the book. Develop a Java program to
// create n book objects.
//Right click-source-Generate getters and setters-select required variables-Generate.

// Book class definition
class Book1 {
    // Private member variables
    private String name;
    private String author;
    private double price;
    private int numOfPages;

    // Getter and setter methods for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    // toString method to display all details of the book
    public String toString() {
        return "Book Details\n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price + "\n" +
               "Number of Pages: " + numOfPages;
    }
}

// Main class to create and display books
public class GETS_TOSTRING {
    public static void main(String[] args) {
        // Number of books to create
        int n = 2;
        Book1[] books = new Book1[n];

        // Creating first book
        books[0] = new Book1();
        books[0].setName("Java Programming");
        books[0].setAuthor("John Doe");
        books[0].setPrice(29.99);
        books[0].setNumOfPages(400);

        // Creating second book
        books[1] = new Book1();
        books[1].setName("Data Structures and Algorithms");
        books[1].setAuthor("Jane Smith");
        books[1].setPrice(39.95);
        books[1].setNumOfPages(550);

        // Displaying book details using getter methods
        System.out.println("Book Details using getter methods");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1));
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Price: $" + books[i].getPrice());
            System.out.println("Number of Pages: " + books[i].getNumOfPages());
        }

        // Displaying book details using toString() method
        System.out.println("\nBook Details using toString()");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
    }
}

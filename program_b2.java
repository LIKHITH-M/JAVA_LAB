// 2. Create a class Book which contains four members: name, author, price, num
// of pages. Include a constructor to set the values for the members. Include
// methods to set and get the details of the objects. Include a toString() method
// that could display the complete details of the book. Develop a Java program to
// create n book objects.

package partB;

// Book1 class representing a book with attributes like name, author, price, and number of pages
class Book1 {
    private String name;        // Name of the book
    private String author;      // Author of the book
    private double price;       // Price of the book
    private int numOfPages;     // Number of pages in the book

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for number of pages
    public int getNumOfPages() {
        return numOfPages;
    }

    // Setter for number of pages
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    // toString() method to provide a formatted string representation of a Book1 object
    public String toString() {
        return "Book Details\n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price + "\n" +
               "Number of Pages: " + numOfPages;
    }
}

// program_b2 class with main method to test Book1 objects
public class program_b2 {
    public static void main(String[] args) {
        int n = 2;  // Number of books to be created
        Book1[] books = new Book1[n];  // Array of Book1 objects

        // Creating first book and setting its properties
        books[0] = new Book1();
        books[0].setName("Java Programming");
        books[0].setAuthor("John Doe");
        books[0].setPrice(29.99);
        books[0].setNumOfPages(400);

        // Creating second book and setting its properties
        books[1] = new Book1();
        books[1].setName("Data Structures and Algorithms");
        books[1].setAuthor("Jane Smith");
        books[1].setPrice(39.95);
        books[1].setNumOfPages(550);

        // Displaying book details using getter methods
        System.out.println("Book Details using getter methods:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1));
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Price: $" + books[i].getPrice());
            System.out.println("Number of Pages: " + books[i].getNumOfPages());
        }

        // Displaying book details using the toString() method
        System.out.println("\nBook Details using toString():");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
    }
}

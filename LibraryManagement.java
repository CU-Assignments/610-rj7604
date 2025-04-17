import java.util.*;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Fiction Book:");
        System.out.print("Title: ");
        String fTitle = sc.nextLine();
        System.out.print("Author: ");
        String fAuthor = sc.nextLine();
        System.out.print("Price: ");
        double fPrice = sc.nextDouble();
        sc.nextLine(); // consume newline

        Fiction fiction = new Fiction(fTitle, fAuthor, fPrice);

        System.out.println("\nEnter details for Non-Fiction Book:");
        System.out.print("Title: ");
        String nfTitle = sc.nextLine();
        System.out.print("Author: ");
        String nfAuthor = sc.nextLine();
        System.out.print("Price: ");
        double nfPrice = sc.nextDouble();

        NonFiction nonFiction = new NonFiction(nfTitle, nfAuthor, nfPrice);

        System.out.println();
        fiction.displayDetails();
        System.out.println();
        nonFiction.displayDetails();
    }
}

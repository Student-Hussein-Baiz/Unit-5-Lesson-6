import java.util.*;
import java.io.*;
import java.lang.System.*;

class Main {
  public static void main(String[] args) {

    Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);

    System.out.println(b);
      
    System.out.println();

    Book b2 = new Book("The Cat in the Hat", "Dr. Seuss", 1957, 61, false);
        
    System.out.println(b2);

    System.out.println();
    System.out.println("Numpages of \"The Cat in the Hat\": " + b2.getNumPages());

    System.out.println("Is \"" + b.getTitle() + "\" hardcover: " + b.getHardCover());

    System.out.println();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter new number of pages for " + b.getTitle() + ":");
    int np = scan.nextInt();
    b.setNumPages(np);
    System.out.println(b);

    System.out.println();
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Change Author for " + b2.getTitle() + ":");
    String a = scan2.nextLine();
    b2.setAuthor(a);
    System.out.println(b2);

    System.out.println();
    System.out.println("Are the books equal? " + b.equals(b));
    System.out.println("Are the books equal? " + b.equals(b2));

    System.out.println();
    //Making default books
    Book def1 = new Book();
    Book def2 = new Book();
    Book def3 = new Book();

    System.out.println("This is default Book 1\n" + def1);
    System.out.println();
    System.out.println("This is default Book 2\n" + def2);
    System.out.println();
    System.out.println("This is default Book 3\n" + def3);
    System.out.println();

    System.out.println("Are the default books equal? " + def1.equals(def2));
  }
}
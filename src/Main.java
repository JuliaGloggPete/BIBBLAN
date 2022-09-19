import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome to our library");

        LIBRARY myLibrary = new LIBRARY();


        while (true) {
            System.out.println("What du you want to do?\n1. Add a book to the library\n" +
                    "2. Search for a book by name\n" +
                    "3. List all available books\n" +
                    "4. Return a book\n" +
                    "5. Quit\n");

            // installera och sätta skanner

            Scanner sc = new Scanner(System.in);
            String val = sc.nextLine();


            if (val.equals("1")) {
                myLibrary.addBook();



            } else if (val.equals("2")) {

                myLibrary.searchByName();


            } else if (val.equals("3")) {

                myLibrary.allAvailableBooks();


            } else if (val.equals("4")) { myLibrary.returnABook();

            } else if (val.equals("5")) {
                System.out.println("Thank you for visiting");
                break;

            } else {
                System.out.println("not an valid option");
            }

        }


    }
}
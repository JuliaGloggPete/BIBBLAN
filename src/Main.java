import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome to our library");

        Book b1 = new Book("Pippi","Astrid Lindgren","1950",2);
        Book b2= new Book("Steppenwolf", "Herrmann Hesse","1920",5);
        Book b3 = new Book("Gröna växeter","Gröna Tanten","2004",8);
        Book b4= new Book("Minimalism", "Minsta Minstingen","2000",4);
        Book b5= new Book("Den moderna häxan","Hedwig Häxstumpa", "1345",6);
        Book b6 = new Book("Tomatoe tomato","Engela Americano","1998",2);
        Book b7= new Book("Var inte rädd", "Anxeita Räddsson","2019",3);
        Book b8= new Book("Vad ska jag äta, egentligen","Dietista Metabolica", "2010",5);


        ArrayList<Book> listofAllBooks = new ArrayList<>();
        listofAllBooks.add(b1);
        listofAllBooks.add(b2);
        listofAllBooks.add(b3);
        listofAllBooks.add(b4);
        listofAllBooks.add(b5);
        listofAllBooks.add(b6);
        listofAllBooks.add(b7);
        listofAllBooks.add(b8);




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

                System.out.println("Please insert the title of your book here:");
                String name = sc.nextLine();
                System.out.println("Please insert the author of your book here:");
                String author = sc.nextLine();
                System.out.println("Please insert the year your book was written here:");
                String year = sc.nextLine();
                System.out.println("Please insert your books edition here:");
                int edition = sc.nextInt();

                listofAllBooks.add(new Book(name, author, year, edition));


            } else if (val.equals("2")) {
                System.out.println("What is the name of the book you are looking for");
                String searchedName= sc.nextLine();

                // letar igenom listan om booken fiins
                // for (int i=0; i <listofAllBooks.size(); i++) {

                //   int x =  i;

                // if (listofAllBooks.get(i).name.contains(searchedName)) {

                for (Book b:listofAllBooks) {
                    if (b.getName().equals(searchedName))
                        //System.out.println("We found ya book!\n" + listofAllBooks.get(i));
                        System.out.println("We do indeed have this masterpiece: " + b);

                    System.out.println("Do you want to borrow it?y/n?");
                    String wantToLoan = sc.nextLine();

                    if (wantToLoan.equals("y")) {

                        System.out.println("ok");
                        b.loan(b);
                        System.out.println("You have borrowed the book.");
                        break;
                        //listofAllBooks.get(i).loan();

                    }}


            } else if (val.equals("3")) {
                for ( Book b: listofAllBooks)
                { if(b.available) {

                    System.out.println(b);
                }}
                // System.out.println(listofAllBooks);

            } else if (val.equals("4")) {
                System.out.println("Whats the title of the book you want to return");
                String returnName= sc.nextLine();

                for(Book book: listofAllBooks) {
                    if (book.getName().equals(returnName)) {
                        if (book.retur()) {
                            System.out.println(book.getName() + " is returned.");
                        } else {
                            System.out.println("The book is not loaned!");
                        }
                        //for (int i=0; i <listofAllBooks.size(); i++) {



                        // if (listofAllBooks.get(i).retur()) {
                        //    System.out.println("Thank you for returning the book");
                        //  }
                    }}
            } else if (val.equals("5")) {
                System.out.println("Thank you for visiting");
                break;

            } else {
                System.out.println("not an valid option");
            }

        }


    }
}
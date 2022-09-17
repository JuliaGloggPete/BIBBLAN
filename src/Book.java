//I denna uppgift ska vi skapa ett enkelt bokningssystem för ett bibliotek. Vi ska börja med
//att skapa en klass som heter Book.


public class Book {

    //Varje book ska ha:namn, författare, år, upplaga, Status tillgängligh elelr ej

    String name;
    String author;
    String year;
    int edition;
    static boolean available;
    //Status ska vara tillgänglig by default när en bok skapas.


    public Book(String name, String author ,String year, int edition){
        this.name=name;
        this.author= author;
        this.year= year;
        this.edition = edition;
        this.available = true;

    }


   // En metod loan som kollar om en bok går att låna eller inte(dvs tillgänglig eller inte) och göra följande:
    //Om boken är tillgänglig, då ska bokens
    // status ändras till otillgänglig och metoden ska returnera true. Annars returnera false

    public boolean loan(Book b){
        if(this.available) {
            this.available = false;
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public boolean retur() {
        if(!this.available) {
            this.available = true;
            return true;
        }
        return false;
    }


    // en method som returnera en sträng med bokinfo
    public String toString(){

        return "Title: "+ this.name + ", Author "+ this.author+ ", from: "+
        this.year +", edition: "+
        this.edition + " currently available: "+
        this.available+"\n";

    }



}

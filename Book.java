import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public String titre;
    public String auteur;
    public int numero;
    public String datepublication;
    public Student currentstudent;

      public Book(String titre){
    this.titre=titre;
}

    public Book(String titre, String auteur, int numero,String datepublication){
        this.titre=titre;
        this.auteur=auteur;
        this.numero=numero;
        this.datepublication=datepublication;
    }
   public Book(){

   }
   public Book(Student currentstudent){
          this.currentstudent=currentstudent;

   }
    public ArrayList<Book> livres = new ArrayList<>();
    public Book edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le ttre de la livre a modifier");
         String titree =scanner.nextLine();

        for (Book book : livres) {
            if (livres.contains(book)) {
                return book;
            }
            else
                return null;
        }

        if(titree!=null) {
            System.out.println("donner le nouvelle titre ");
            String titre = scanner.nextLine();
            System.out.println("donner le nouvelle auteur ");
            String auteur = scanner.nextLine();
            System.out.println("donner le nouvelle numero ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("donner le nouvelle date ");
            String datepublication = scanner.nextLine();
            Book bookaditer = new Book();
            bookaditer.titre = titre;
            bookaditer.auteur = auteur;
            bookaditer.numero = numero;
            bookaditer.datepublication = datepublication;
            System.out.println("bien modifier ");

        }
        else
            System.out.println("ce livre pas exist");
        return null;
    }
}






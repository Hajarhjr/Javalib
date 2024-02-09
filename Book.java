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
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le ttre de la livre a modifier");
         String titree =scanner.nextLine();
         Book book1 = new Book();
        for (Book book : livres) {
            if (book.titre.equals(titree)) {
                book1 = book;
            }
//            else
//                System.out.println("ce livre pas exist");
        }
        if (book1 != null){
            System.out.println("donner le nouvelle titre ");
            String titre = scanner.nextLine();
            System.out.println("donner le nouvelle auteur ");
            String auteur = scanner.nextLine();
            System.out.println("donner le nouvelle numero ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("donner le nouvelle date ");
            String datepublication = scanner.nextLine();
//            Book bookaditer = new Book();
            book1.titre = titre;
            book1.auteur = auteur;
            book1.numero = numero;
            book1.datepublication = datepublication;
            System.out.println("bien modifier ");
        }
    }
}








import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String titre;
    private String auteur;
    private int numero;
    private String datepublication;
    private boolean reserved;
    public boolean emprinter = false;

    public Book(String titre){
        this.titre=titre;
    }

    public Book(String titre, String auteur, int numero,String datepublication){
        this.titre=titre;
        this.auteur=auteur;
        this.numero=numero;
        this.datepublication=datepublication;

        this.reserved=false;
    }
    public Book() {

    }


    public String gettitre() {
        return titre;
    }
    public void settitre(String titre) {
        this.titre=titre;
    }
    public String getauteur() {
        return auteur;
    }
    public void setauteur(String auteur) {
        this.auteur=auteur;
    }
    public int getnumero() {
        return numero;
    }
    public void setnumero(int numro) {
        this.numero = numero;
    }
    public String getdatepublication() {
        return datepublication;
    }
    public void setdatepublication(String datepublication) {
        this.datepublication=datepublication;

    }



    public boolean getreserver() {
        return reserved;
    }
    public void setreserver(boolean reserved) {
        this.reserved = reserved;
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






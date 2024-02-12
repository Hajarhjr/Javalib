package testjava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Menu {

 public static void main(String[] args) {
     Library  library=new Library();
     Book book= new Book();
     Scanner scanner =new Scanner(System.in);
     int choix;
do {
 System.out.println("le menu :");
 System.out.println("1 ajouter un livre");
 System.out.println("2 ajouter un etudiant");
 System.out.println("3 supprimer un livre ");
 System.out.println("4 pour chercher un livre ");
 System.out.println("5 pour modifier un livre ");
 System.out.println("6 livres reserver par letudiant   ");
 System.out.println("7 livres emprinter par letudiant   ");
 System.out.println("8 afficher un livre");
 System.out.println("0 Quitter");
 System.out.print("Entrez votre choix ");
 choix = scanner.nextInt();
 scanner.nextLine();
 switch (choix) {
     case 1:
         Book newBook = getBook();
         library.addBook(newBook);
         break;
     case 2:
         Student newstudent = getStudent();
         library.addStudent(newstudent);
         break;
     case 3:
         System.out.println("donner le titre de livre a supprimer");
         String titre = scanner.nextLine();
         Book newbookd = new Book(titre);
         library.deletebook(newbookd.gettitre());

         break;
     case 4:
         System.out.println("donner la date de publication de livre ");
         String datepublication = scanner.nextLine();
         Book nbook = new Book(datepublication);
         library.serchbook();
         break;
     case 5:
         
         //Book newbookdd = new Book(titree);
         book.edit();
         library.showbook();
         break;
     case 6:
    	 System.out.println("donner votre id ");
    	 int idstudent =scanner.nextInt();
    	 scanner.nextLine();
    	 System.out.println("donner l' ID de livre ");
    	 int idbook =scanner.nextInt();
    	 scanner.nextLine();
    	 library.reservation(idbook,idstudent);
         break;
     case 7:
    	 System.out.println("donner votre id ");
    	 int idstudents =scanner.nextInt();
    	 scanner.nextLine();
    	 System.out.println("donner  id de livre ");
    	 int idbooks =scanner.nextInt();
    	 scanner.nextLine();
    	 library.emprinter(idstudents, idbooks);
    	 break;
     case 8:
         library.showbook();
       break;
     case 0:
         System.out.println("goodbay !!");
         break;
     default:
         System.out.println(" erreur  !!!!");
         break;
 }
}while (choix!=0);

 }

 private static Student getStudent() {
     Scanner scanner=new Scanner(System.in);
     System.out.println("entrer le nom de l'Apprenant");
     String nom = scanner.nextLine();
     System.out.println("donner le l'adress de l'Apprenant ");
     String adresse = scanner.nextLine();
     System.out.println("donner le ID de L'Apprenant ");
     int id = scanner.nextInt();
     scanner.nextLine();
     Student newstudent = new Student(nom, adresse, id);
     return newstudent;
 }

 private static Book getBook() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("entrez le titre du livre: ");
     String titre = scanner.nextLine();
     System.out.print("entrez l'auteur du livre: ");
     String auteur = scanner.nextLine();
     System.out.print("entrez le numero du livre: ");
     int numero = scanner.nextInt();
     scanner.nextLine();
     System.out.print("entrez la date de publication du livre: ");
     String datepublication = scanner.nextLine();
     Book newBook = new Book(titre, auteur, numero, datepublication);
     return newBook;
 }

}


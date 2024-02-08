//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Library  library=new Library();
        Scanner scanner =new Scanner(System.in);
        int choix;
do {
    System.out.println("le menu:");
    System.out.println("1 Ajouter un livre");
    System.out.println("2 Ajouter un etudiant");
    System.out.println("3 supprimer un livre ");
    System.out.println("4 Quitter");
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
            Book newBook1 = new Book(titre);
            for(Book NBK: library.books ){
                  library.deletebook(NBK);
            }
            break;
        case 4:
            System.out.println("au revoir !!");
            break;
        default:
            System.out.println("erreur !!!!");
            break;
    }
}while (choix!=4);

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
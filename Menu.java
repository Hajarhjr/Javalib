

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
            System.out.println();

            System.out.println("................................LE MENU .................................:......");
            System.out.println("................................................................................");
            System.out.println(".                         1- Ajouter un livre                                  .");
            System.out.println(".                         2- Ajouter un etudiant                               .");
            System.out.println(".                         3- Supprimer un livre                                .");
            System.out.println("................................................................................");
            System.out.println(".                         4- Chercher un livre                                 .");
            System.out.println(".                         5- Modifier un livre                                 .");
            System.out.println(".                         6- Reserver un livre                                 .");
            System.out.println("................................................................................");
            System.out.println(".                         7- Emprinter un livre                                .");
            System.out.println(".                         8- Afficher un livre                                 .");
            System.out.println(".                         9- Afficher les livres reserver                      .");
            System.out.println("................................................................................");
            System.out.println(".                         10- Afficher les livres emprinter                    .");
            System.out.println("................................................................................");
            System.out.println(".                                0- Quitter                                    .");
            System.out.println("................................................................................");
            System.out.println(".                          Entrez votre choix ^_^                              .");
            System.out.println("................................................................................");
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
                    System.out.println("Donner le titre du livre a supprimer");
                    String titre = scanner.nextLine();
                    Book newbookd = new Book(titre);
                    library.deletebook(newbookd.gettitre());

                    break;
                case 4:
                    System.out.println("Donner la date de publication du livre ");
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
                    System.out.println("Donner l' ID de l'etudiant ");
                    int idstudent =scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner l' ID du livre ");
                    int idbook =scanner.nextInt();
                    scanner.nextLine();
                    library.reservation(idbook,idstudent);

                    break;
                case 7:
                    System.out.println("Donner l'ID de l'etudiant  ");
                    int idstudents =scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner  ID de livre ");
                    int idbooks =scanner.nextInt();
                    scanner.nextLine();
                    library.emprinter(idstudents, idbooks);
                    break;
                case 8:
                    library.showbook();
                    break;
                case 9:
                    System.out.println("Donner l' ID de l'etudiant ");
                    int idstudentss =scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner l' ID du livre ");
                    int idbookss =scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("donner le titre de le livre que vous voulez reserver");
                    String titree=scanner.nextLine();
                    library.showbookReserver(idstudentss,idbookss,titree);
                    break;
                case 10:
                    System.out.println("Donner l' ID de l'etudiant ");
                    int idStudentss =scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner l' ID du livre ");
                    int idBookss =scanner.nextInt();
                    scanner.nextLine();
                    library.showbooksemprinter(idStudentss,idBookss);
                    break;
                case 0:
                    System.out.println("Au revoir !!");
                    break;
                default:
                    System.out.println(" Erreur  !!!!");
                    break;
            }
        }while (choix!=0);

    }

    private static Student getStudent() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer le nom de L'etudiant ");
        String nom = scanner.nextLine();
        System.out.println("Donner le l'adress de L'etudiant ");
        String adresse = scanner.nextLine();
        System.out.println("Donner le ID de L'etudiant ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student newstudent = new Student(nom, adresse, id);
        return newstudent;
    }

    private static Book getBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le titre du livre: ");
        String titre = scanner.nextLine();
        System.out.print("Entrez l'auteur du livre: ");
        String auteur = scanner.nextLine();
        System.out.print("Entrez le numero du livre: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrez la date de publication du livre: ");
        String datepublication = scanner.nextLine();
        Book newBook = new Book(titre, auteur, numero, datepublication);
        return newBook;
    }

}


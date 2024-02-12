

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();

    public void addBook(Book newbook) {
        if (books.contains(newbook)) {
            System.out.println("Ce livre est deja dans la bibliotheque.");
        } else {
            books.add(newbook);
            System.out.println(("Livre ajouter avec sucsee !!!!"));
        }
    }

    public void addStudent(Student newstudent) {
        if (students.contains(newstudent)) {
            System.out.println("Ce etudiant est deja exist ");
        } else {
            students.add(newstudent);
            System.out.println(("Etudiant ajouter avec sucsee !!!"));
        }
    }

    public void deletebook(String newbookd) {

        for (Book nb : books) {
            if (newbookd.equals(nb.gettitre())) {
                books.remove(nb);
                System.out.println("Ce livre est supprimer!!");
                return;
            }
        }
        System.out.println("Y a aucun livre avec ce titre");

    }

    public void showbook() {
        for (Book shbook : books) {
            System.out.println("Le titre est"+" "+ shbook.gettitre());
            System.out.println("L'auteur de le livre est"+" "+shbook.getauteur());
            System.out.println("Le numero de livre est "+" "+shbook.getnumero());
            System.out.println("La date de publication est "+" "+shbook.getdatepublication());
        }
    }


    public void serchbook() {
        for (Book sbook : books) {
            if (books.contains(sbook)) {
                System.out.println("Ce livre est exist !!");
                System.out.println("Le titre de livre est "+" "+ sbook.gettitre());
                System.out.println("L'auteur  de livre est "+" "+sbook.getauteur());
                System.out.println("Le numero de livre est "+" "+sbook.getnumero());
                System.out.println("La date de publication de livre est " +" "+ sbook.getdatepublication());
            } else {
                System.out.println("Ce livre est pas exist!!");
            }

        }

    }

    public void reservation(int idbook, int idstudent) {
        for (Student studn : students) {
            if (studn.id() == idstudent) {
                for (Book bookres : books) {
                    if (bookres.getnumero() == idbook && bookres.getreserver() == false) {
                        studn.booksreserver.add(bookres);

                        bookres.setreserver(true);
                        System.out.println("Reservation avec sucsee");
                    } else {
                        System.out.println("Ce livre est deja reserver ou n'existe pas!!!");
                    }
                }
            }

        }

    }
    public void showbookReserver(int idstudent,int idbook,String titree) {
        for (Student shbook : students) {
            if(shbook.id() == idstudent){
                for (Book bookres : books)
                    if(bookres.getnumero()==idbook&&bookres.getreserver()==true){
                        bookres.setreserver(false);
                        System.out.println("Le livre avec l' ID "+" "+ shbook.id() + "est reserver ");
                        System.out.println("Le livre avec le titre "+" "+ bookres.gettitre() + "est  reserver ");

                    }
            }else{System.out.println("Ce livre pas exist  ");}


        }


    }
    public void emprinter(int idstudent, int idbook) {
        for(Student studn : students) {
            if(studn.id() == idstudent) {
                for( Book book :studn.booksreserver ) {
                    if(book.getnumero()== idbook && book.getreserver()==true&& book.emprinter== false) {
                        book.emprinter = true;
                        System.out.println("Livre emprinter avec sucsee");
                    }else System.out.println("Ce livre est deja emprinter ou vous n'avez pas encore reserver");
                }
            }
        }
    }
    public void showbooksemprinter(int idstudent, int idbook) {
        for(Student studn : students) {
            if(studn.id() == idstudent) {
                for( Book book :studn.booksreserver ) {
                    if(book.getnumero()== idbook && book.getreserver()==true&& book.emprinter== true) {
                        book.emprinter = false;
                        System.out.println("Le livre avec l 'ID " +" "+book.getnumero()+ " est deja emprinter ");
                    }
                }
            }else System.out.println("Ce livre est pas existe ou pas emprinter ");
        }
    }
}
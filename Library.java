import java.util.ArrayList;
public class Library {
    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();

    public void addBook(Book newbook) {
        if (books.contains(newbook)) {
            System.out.println("Ce livre est deja dans la bibliotheque.");
        } else {
            books.add(newbook);
            System.out.println(("livre ajouter avec sucsee !!!!"));
        }
    }

    public void addStudent(Student newstudent) {
        if (students.contains(newstudent)) {
            System.out.println("ce etudiant est deja exist ");
        } else {
            students.add(newstudent);
            System.out.println(("etudiant ajouter avec sucsee !!!"));
        }
    }

    public void deletebook(String newbookd) {

        for (Book nb : books) {
            if (newbookd.equals(nb.titre)) {
                books.remove(nb);
                System.out.println("ce livre est supprimer!!");
                return ;
            }
        }
        System.out.println("y a aucun livre ");


    }
    public void showbook(){
        for(Book shbook : books){
            System.out.println("le titre est" +shbook.titre);
            System.out.println("l'auteur de le livre est" +shbook.auteur);
            System.out.println("le numero de livre est " +shbook.numero);
            System.out.println("la date de publication est " +shbook.datepublication);
        }
    }
public void serchbook() {
    for (Book sbook : books) {
        if (books.contains(sbook)) {
            System.out.println("ce livre est exist !!");
            System.out.println("le titre de livre est "+sbook.titre);
            System.out.println("l'auteur  de livre est "+sbook.auteur);
            System.out.println("le numero de livre est "+sbook.numero);
            System.out.println("la date de publication de livre est "+sbook.datepublication);
        } else {
            System.out.println("ce livre est pas exist!!");
        }

    }


}
}

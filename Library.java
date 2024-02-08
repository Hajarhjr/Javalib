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

    public void deletebook(Book newbookdl) {

        for (Book nb : books) {
            if (nb.equals(newbookdl)) {
       System.out.println("ce livre deja exist !!");
            } else {
                books.remove(newbookdl);
            }

        }


    }
}

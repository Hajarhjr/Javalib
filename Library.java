package testjava;

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
			if (newbookd.equals(nb.gettitre())) {
				books.remove(nb);
				System.out.println("ce livre est supprimer!!");
				return;
			}
		}
		System.out.println("y a aucun livre ");

	}

	public void showbook() {
		for (Book shbook : books) {
			System.out.println("le titre est" + shbook.gettitre());
			System.out.println("l'auteur de le livre est" + shbook.getauteur());
			System.out.println("le numero de livre est " + shbook.getnumero());
			System.out.println("la date de publication est " + shbook.getdatepublication());
		}
	}

	public void serchbook() {
		for (Book sbook : books) {
			if (books.contains(sbook)) {
				System.out.println("ce livre est exist !!");
				System.out.println("le titre de livre est " + sbook.gettitre());
				System.out.println("l'auteur  de livre est " + sbook.getauteur());
				System.out.println("le numero de livre est " + sbook.getnumero());
				System.out.println("la date de publication de livre est " + sbook.getdatepublication());
			} else {
				System.out.println("ce livre est pas exist!!");
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
						System.out.println("reservation avec sucsee");
					} else {
						System.out.println("ce livre est deja reserver ou n'existe pas!!!");
					}
				}
			}

		}

	}
	public void emprinter(int idstudent, int idbook) {
		for(Student studn : students) {
			if(studn.id() == idstudent) {
				for( Book book :studn.booksreserver ) {
					if(book.getnumero()== idbook && book.getreserver()==true&& book.emprinter== false) {
						book.emprinter = true;
						System.out.println("livre emprinter avec sucsee");
					}else System.out.println("ce livre est deja emprinter ou vous n'avez pas encore reserver");
				}
			}
		}
	}
}

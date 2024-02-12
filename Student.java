

import java.util.ArrayList;

public class Student {
    private String nom;
    private String adresse;
    private int id;
    public ArrayList<Book> booksemprunter = new ArrayList<>();
    public ArrayList<Book> booksreserver= new ArrayList<>();


    public Student(String nom,String adresse,int id){
        this.nom=nom;
        this.adresse=adresse;
        this.id=id;

    }
    public String getnom() {
        return nom;

    }
    public void setnom(String nom) {
        this.nom=nom;

    }
    public String getadresse() {
        return adresse;
    }
    public void setadresse(String adresse) {
        this.adresse=adresse;
    }
    public int id() {
        return id;
    }
    public void id(int id) {
        this.id=id;
    }

}
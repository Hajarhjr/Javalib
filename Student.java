import java.util.ArrayList;

public class Student {
    public String nom;
    public String adresse;
    public int id;
    public ArrayList<Book> bookses = new ArrayList<>();
    public Student(String nom,String adresse,int id){
        this.nom=nom;
        this.adresse=adresse;
        this.id=id;
    }




}


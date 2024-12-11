package main.java;

/**
* Représente un employé dans une entreprise.
*/
public class Employee {
    private String nom;
    private int id;
    private String position;

    // Constructeur pour initialiser les attributs.
    public Employee(String nom, int id, String position){
        this.nom = nom;
        this.id = id;
        this.position = position;
    }
    
    // Méthodes pour récupérer les valeurs des attributs (getters).
    public String getNom(){
        return this.nom;
    }
    public int getId(){
        return this.id;
    }
    public String getPosition(){
        return this.position;
    }
    public String toString(){
        return "Le nom est :"+this.nom+" avec pour id :"+this.id+"comme position"+ this.position;
    }
}
    
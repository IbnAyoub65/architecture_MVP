package models;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private List<Compte> comptes;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = new ArrayList<>();
    }

    public Client() {
        this.comptes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void ajouterCompte(Compte compte) {
        this.comptes.add(compte);
    }
}

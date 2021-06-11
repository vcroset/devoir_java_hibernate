package fr.valentincroset.devoir.model;

import javax.persistence.*;

@Entity
@Table(name = "Directeur")
public class Directeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "nom", nullable = true, unique = false)
    private String nom;
    @Column(name = "prenom", nullable = true, unique = false)
    private String prenom;

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
}

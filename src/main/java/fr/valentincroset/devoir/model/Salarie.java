package fr.valentincroset.devoir.model;

import javax.persistence.*;

@Entity
@Table(name = "Salarie")
public class Salarie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = false)
    private int id;
    @Column(name = "nom", nullable = true, unique = false)
    private String nom;
    @Column(name = "prenom", nullable = true, unique = false)
    private String prenom;
    @Column(name = "salaire", nullable = true, unique = false)
    private float salaire;
    @ManyToOne
    @JoinColumn(name = "idDirecteur")
    private Directeur idDirecteur;

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

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public Directeur getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(Directeur idDirecteur) {
        this.idDirecteur = idDirecteur;
    }
}

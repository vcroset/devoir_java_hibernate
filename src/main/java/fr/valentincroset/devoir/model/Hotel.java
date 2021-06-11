package fr.valentincroset.devoir.model;

import javax.persistence.*;

@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "nom", nullable = true, unique = false, length = 50)
    private String nom;
    @Column(name = "adresse", nullable = true, unique = false, length = 50)
    private String adresse;
    @Column(name = "telephone", nullable = true, unique = false, length = 50)
    private String telephone;

    public Hotel() {

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

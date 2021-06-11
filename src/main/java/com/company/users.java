package com.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.soap.Text;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = { "id" }) })
public class users {

    private Long id;
    private String nom;

    public users() {

    }

    public users(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Column(name = "nom", nullable = false)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }




}

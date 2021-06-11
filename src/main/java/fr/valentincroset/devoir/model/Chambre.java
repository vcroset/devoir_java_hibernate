package fr.valentincroset.devoir.model;

import javax.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_chambre", nullable = false, unique = false)
    private int numChambre;
    @Column(name = "superficie", nullable = false, unique = false)
    private float superficie;
    @Column(name = "type", nullable = false, unique = false)
    private String type;
    @Column(name = "etage", nullable = false, unique = false)
    private int etage;
    @ManyToOne
    @JoinColumn(name="idHotel")
    private Hotel idHotel;

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public Hotel getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Hotel idHotel) {
        this.idHotel = idHotel;
    }
}

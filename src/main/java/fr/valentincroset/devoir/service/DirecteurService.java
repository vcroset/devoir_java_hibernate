package fr.valentincroset.devoir.service;

import fr.valentincroset.devoir.model.Directeur;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class DirecteurService implements Serializable {

    public boolean create(Directeur c, Session s) {
        s.save(c);
        return true;
    }

    public void delete(Session s, int id) {
        Directeur c = s.get(Directeur.class, id);
        s.delete(c);
    }

    public void update(Session s, int id) {
        Directeur c = s.get(Directeur.class, id);
        c.setPrenom("Paul");
        s.update(c);
    }

    public Directeur findById(Session s, int id) {
        Directeur c = s.get(Directeur.class, id);
        return c;
    }

    public List<Directeur> findAll(Session s) {
        Query q = s.createQuery("from Directeur");
        List<Directeur> listeC = q.list();

        return listeC;
    }

}

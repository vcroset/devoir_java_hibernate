package fr.valentincroset.devoir.service;

import fr.valentincroset.devoir.model.Chambre;
import fr.valentincroset.devoir.model.Directeur;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class ChambreService implements Serializable {

    public boolean create(Chambre c, Session s) {
        s.save(c);
        return true;
    }

    public void delete(Session s, int id) {
        Chambre c = s.get(Chambre.class, id);
        s.delete(c);
    }

    public void update(Session s, int id) {
        Chambre c = s.get(Chambre.class, id);
        c.setEtage(5);
        s.update(c);
    }

    public Chambre findById(Session s, int id) {
        Chambre c = s.get(Chambre.class, id);
        return c;
    }

    public List<Chambre> findAll(Session s) {
        Query q = s.createQuery("from Chambre");
        List<Chambre> listeC = q.list();

        return listeC;
    }

}

package fr.valentincroset.devoir.service;

import fr.valentincroset.devoir.model.Chambre;
import fr.valentincroset.devoir.model.Hotel;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class HotelService implements Serializable {

    public boolean create(Hotel c, Session s) {
        s.save(c);
        return true;
    }

    public void delete(Session s, int id) {
        Hotel c = s.get(Hotel.class, id);
        s.delete(c);
    }

    public void update(Session s, int id) {
        Hotel c = s.get(Hotel.class, id);
        c.setAdresse("77 rue test");
        s.update(c);
    }

    public Hotel findById(Session s, int id) {
        Hotel c = s.get(Hotel.class, id);
        return c;
    }

    public List<Hotel> findAll(Session s) {
        Query q = s.createQuery("from Hotel");
        List<Hotel> listeC = q.list();

        return listeC;
    }

}

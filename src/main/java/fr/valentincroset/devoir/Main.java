package fr.valentincroset.devoir;

import fr.valentincroset.devoir.model.Directeur;
import fr.valentincroset.devoir.model.Salarie;
import fr.valentincroset.devoir.service.DirecteurService;
import fr.valentincroset.devoir.service.SalarieService;
import org.hibernate.Session;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("lancement...");

        SalarieService salarieService = new SalarieService();
        DirecteurService directeurService = new DirecteurService();

        Directeur directeur1 = new Directeur();
        directeur1.setNom("Croset");
        directeur1.setPrenom("Valentin");

        Salarie salarie1 = new Salarie();
        salarie1.setIdDirecteur(directeur1);
        salarie1.setNom("test");
        salarie1.setPrenom("test");
        salarie1.setSalaire(39000);

        Salarie salarie2 = new Salarie();
        salarie2.setIdDirecteur(directeur1);
        salarie2.setNom("test2");
        salarie2.setPrenom("test2");
        salarie2.setSalaire(29000);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        directeurService.create(directeur1, session);
        salarieService.create(salarie1, session);
        salarieService.create(salarie2, session);

        Salarie maxSalaire = salarieService.findAll(session).stream().
                max(Comparator.comparingDouble(Salarie::getSalaire)).get();

        System.out.println("Le plus gros salaire est : " + maxSalaire.getSalaire());

    }


}

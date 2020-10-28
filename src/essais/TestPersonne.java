package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(12,"rue du moulin",44100,"Nantes");
        AdressePostale adresse2 = new AdressePostale(21,"rue de la poule",44000,"Nantes");

        Personne p1 = new Personne("Boursin","Baptiste",adresse1);
        Personne p2 = new Personne("Jean","Dupont",adresse2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

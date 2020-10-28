package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne(String nom_pers, String prenom_pers,AdressePostale adresse_pers){
        this.nom=nom_pers;
        this.prenom=prenom_pers;
        this.adresse=adresse_pers;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse.toString() +
                '}';
    }
}

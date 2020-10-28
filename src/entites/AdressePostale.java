package entites;

public class AdressePostale {
    private int num_rue;
    private String libellle;
    private int code_postal;
    private String ville;

    public AdressePostale(int numero, String libelle_rue, int cp,String ville){
        this.num_rue = numero;
        this.libellle=libelle_rue;
        this.code_postal=cp;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "num_rue=" + num_rue +
                ", libellle='" + libellle + '\'' +
                ", code_postal=" + code_postal +
                ", ville='" + ville + '\'' +
                '}';
    }
}

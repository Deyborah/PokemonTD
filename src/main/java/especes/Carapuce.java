package especes;

public class Carapuce extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "Carapuce";

    /**
     * Constructeur sans paramètre de l'espèce Carapuce
     * Surcharge de la propriété nom par le nom de l'espèce
     */
    public Carapuce() {
        super.nom = NOM;
    }

    /**
     * Constructeur sans paramètre de l'espèce Carapuce
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     */
    public Carapuce(String nom){
        super.nom = nom;
    }
}

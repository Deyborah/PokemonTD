package especes;

public class Bulbizarre extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "Bulbizarre";

    /**
     * Constructeur sans paramètre de l'espèce Bulbizarre
     * Surcharge de la propriété nom par le nom de l'espèce
     */
    public Bulbizarre() {
        super.nom = NOM;
    }

    /**
     * Constructeur sans paramètre de l'espèce Bulbizarre
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     */
    public Bulbizarre(String nom) {
        super.nom = nom;
    }
}

public class Salameche extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "Salamèche";

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom de l'espèce
     */
    public Salameche(){
        super.nom = NOM;
        super.type = new Type("Feu");
    }

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     */
    protected Salameche(String nom) {
        super(nom);
    }

}

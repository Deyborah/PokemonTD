package pokemon.pokemons.especes;

import pokemon.arene.Attaque;
import pokemon.pokemons.Pokemon;
import pokemon.type.Type;
import pokemon.type.TypeInterface;

import java.util.ArrayList;

public class Salameche extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "Salamèche";

    /**
     * Constante permettant de créer le type du pokemon et de son attaque (feu)
     */
    private static Type typeFeu = new Type("feu");

    /**
     * Constante permettant de créer le type des attaques normales
     */
    private static Type typeNormal = new Type("normal");

    /**
     * Liste des attaques de l'espece de pokemon
     */
    private ArrayList<Attaque> listeAttaque = new ArrayList<>();
    Attaque attaqueFeu = new Attaque("Lance flammes", typeFeu, 5);
    Attaque charge = new Attaque("Charge", typeNormal, 2);
    Attaque griffe = new Attaque("Griffe", typeNormal, 5);

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom de l'espèce
     * Surcharge la propriété type par le pokemon.type.Type adéquate (Feu)
     * Surcharge de la liste des attaques
     */
    public Salameche(){
        super.nom = NOM;
        super.type = TypeInterface.typeFeu;
        listeAttaque.add(attaqueFeu);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.attaque = listeAttaque;
    }

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     * Surcharge la propriété type par le pokemon.type.Type adéquate (Feu)
     * Surcharge de la liste des attaques
     */
    protected Salameche(String nom) {
        super.nom = nom;
        super.type = TypeInterface.typeFeu;
        listeAttaque.add(attaqueFeu);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.attaque = listeAttaque;
    }

}

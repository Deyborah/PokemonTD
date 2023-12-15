package pokemon.pokemons.especes;

import pokemon.arene.Attaque;
import pokemon.pokemons.Pokemon;
import pokemon.type.Type;

import java.util.ArrayList;

public class Salameche extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "Salamèche";

    /**
     * Constante permettant d'insérer le type de l'espèce
     */
    private static Type typeFeu = new Type("feu");

    private static Type typeNormal = new Type("normal");

    //Initialisation de la liste d'attaque
    private ArrayList<Attaque> listeAttaque = new ArrayList<>();
    Attaque attaqueFeu = new Attaque("Lance flammes", typeFeu, 5);
    Attaque charge = new Attaque("Charge", typeNormal, 2);
    Attaque griffe = new Attaque("Griffe", typeNormal, 5);

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom de l'espèce
     */
    public Salameche(){
        super.nom = NOM;
        super.type = typeFeu;
        listeAttaque.add(attaqueFeu);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.attaque = listeAttaque;
    }

    /**
     * Constructeur sans paramètre de l'espèce Salamèche
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     */
    protected Salameche(String nom) {
        super.nom = nom;
        super.type = typeFeu;
        listeAttaque.add(attaqueFeu);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.attaque = listeAttaque;
    }

}

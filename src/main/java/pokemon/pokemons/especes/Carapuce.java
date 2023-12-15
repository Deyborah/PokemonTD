package pokemon.pokemons.especes;

import pokemon.arene.Attaque;
import pokemon.pokemons.Pokemon;
import pokemon.type.Type;
import pokemon.type.TypeInterface;

import java.util.ArrayList;

public class Carapuce extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "pokemon.pokemons.especes.Carapuce";

    /**
     * Constante permettant d'insérer le type du pokemon et de son attaque (eau)
     */
    private static Type typeEau = new Type("eau");

    /**
     * Constante permettant de créer le type des attaques normales
     */
    private static Type typeNormal = new Type("normal");

    /**
     * Liste des attaques de l'espece de pokemon
     */
    private ArrayList<Attaque> listeAttaque = new ArrayList<>();
    Attaque attaqueEau = new Attaque("Pistolet à eau", typeEau, 5);
    Attaque charge = new Attaque("Charge", typeNormal, 2);
    Attaque griffe = new Attaque("Griffe", typeNormal, 5);

    /**
     * Constructeur sans paramètre de l'espèce pokemon.pokemons.especes.Carapuce
     * Surcharge de la propriété nom par le nom de l'espèce
     * Surcharge la propriété type par le pokemon.type.Type adéquate (Eau)
     * Surcharge de la liste des attaques
     */
    public Carapuce() {
        super.nom = NOM;
        super.type = TypeInterface.typeEau;
        listeAttaque.add(attaqueEau);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.setAttaque(listeAttaque);
    }

    /**
     * Constructeur sans paramètre de l'espèce pokemon.pokemons.especes.Carapuce
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     * Surcharge la propriété type par le pokemon.type.Type adéquate (Eau)
     * Surcharge de la liste des attaques
     */
    public Carapuce(String nom) {
        super.nom = nom;
        super.type = TypeInterface.typeEau;
        listeAttaque.add(attaqueEau);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.setAttaque(listeAttaque);
    }

}
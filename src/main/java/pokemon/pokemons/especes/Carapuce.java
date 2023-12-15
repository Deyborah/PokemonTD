package pokemon.pokemons.especes;

import pokemon.arene.Attaque;
import pokemon.pokemons.Pokemon;
import pokemon.type.Type;

import java.util.ArrayList;

public class Carapuce extends Pokemon {

    /**
     * Constante permettant d'insérer le nom de l'espèce dans le cas où
     * l'utilisateur construit un pokémon sans lui donner de nom
     */
    private static final String NOM = "pokemon.pokemons.especes.Carapuce";

    /**
     * Constante permettant d'insérer le type de l'espèce
     */
    private static Type typeEau = new Type("eau");
    private static Type typeNormal = new Type("normal");


    private ArrayList<Attaque> listeAttaque = new ArrayList<>();
    Attaque attaqueEau = new Attaque("Pistolet à eau", typeEau, 5);
    Attaque charge = new Attaque("Charge", typeNormal, 2);
    Attaque griffe = new Attaque("Griffe", typeNormal, 5);

    /**
     * Constructeur sans paramètre de l'espèce pokemon.pokemons.especes.Carapuce
     * Surcharge de la propriété nom par le nom de l'espèce
     */
    public Carapuce() {
        super.nom = NOM;
        super.type = typeEau;
        listeAttaque.add(attaqueEau);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.setAttaque(listeAttaque);
    }


    /**
     * Constructeur sans paramètre de l'espèce pokemon.pokemons.especes.Carapuce
     * Surcharge de la propriété nom par le nom donné par l'utilisateur
     */
    public Carapuce(String nom) {
        super.nom = nom;
        super.type = typeEau;
        listeAttaque.add(attaqueEau);
        listeAttaque.add(charge);
        listeAttaque.add(griffe);
        super.setAttaque(listeAttaque);
    }

}
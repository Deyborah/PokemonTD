package pokemon.arene;

import pokemon.pokemons.Pokemon;
import pokemon.type.Type;

public class InitialisationAttaque implements Attaquer {

    //Initialisation des Types
    static Type feu = new Type("feu");
    static Type eau = new Type("eau");
    static Type plante = new Type("plante");
    static Type normal = new Type("normal");


    public static Type getFeu() {
        return feu;
    }

    public static Type getEau() {
        return eau;
    }

    public static Type getPlante() {
        return plante;
    }

    public static Type getNormal() {
        return normal;
    }


    //Initialisation des attaques
    Attaque griffe = new Attaque("griffe", normal, 5);
    Attaque charge = new Attaque("charge", normal, 2);
    Attaque lanceFlamme = new Attaque("lance-flamme", feu, 5);
    Attaque pistoletAEau = new Attaque("pistolet à eau", eau, 5);
    Attaque fouetLianes = new Attaque("fouet lianes", plante, 5);

    public Attaque getGriffe() {
        return griffe;
    }

    public void setGriffe(Attaque griffe) {
        this.griffe = griffe;
    }

    public Attaque getCharge() {
        return charge;
    }

    public void setCharge(Attaque charge) {
        this.charge = charge;
    }

    public Attaque getLanceFlamme() {
        return lanceFlamme;
    }

    public void setLanceFlamme(Attaque lanceFlamme) {
        this.lanceFlamme = lanceFlamme;
    }

    public Attaque getPistoletAEau() {
        return pistoletAEau;
    }

    public void setPistoletAEau(Attaque pistoletAEau) {
        this.pistoletAEau = pistoletAEau;
    }

    public Attaque getFouetLianes() {
        return fouetLianes;
    }

    public void setFouetLianes(Attaque fouetLianes) {
        this.fouetLianes = fouetLianes;
    }

    @Override
    public void attaquer(Pokemon pokemon1, Pokemon pokemon2) {

    }
}

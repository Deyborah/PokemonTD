package pokemon.type;

import java.util.ArrayList;

public interface TypeInterface {

    public final static Type typeFeu = new Type("Feu");
    public final static Type typeEau = new Type("Eau");
    public final static Type typePlante = new Type("Plante");

    public ArrayList<Type> getlisteFaible(Type typePokemon);

    public ArrayList<Type> getlisteFort(Type typePokemon);

}

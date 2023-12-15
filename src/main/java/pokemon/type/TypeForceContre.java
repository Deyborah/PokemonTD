package pokemon.type;

import java.sql.Array;
import java.util.ArrayList;

public class TypeForceContre implements TypeInterface{
    @Override
    public ArrayList<Type> getlisteFaible(Type typePokemon) {
        ArrayList<Type> listeFaiblesse = new ArrayList<>();

        if (typePokemon.equals(TypeInterface.typeEau)){
            listeFaiblesse.add(TypeInterface.typePlante);
        } else if (typePokemon.equals(TypeInterface.typePlante)){
            listeFaiblesse.add(TypeInterface.typeFeu);
        } else if (typePokemon.equals(TypeInterface.typeFeu)) {
            listeFaiblesse.add(TypeInterface.typeEau);
        }

        return listeFaiblesse;
    }

    @Override
    public ArrayList<Type> getlisteFort(Type typePokemon) {
        return null;
    }
}

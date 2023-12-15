package pokemon.type;

import java.util.ArrayList;

public class Type {
    public String nom;
    protected ArrayList<Type> fortContre = new ArrayList<>();
    protected ArrayList<Type> faibleContre =new ArrayList<>();

    public static ArrayList<Type> types = new ArrayList<>();

    public Type(){

    }

    public Type(String nom){
        this.nom = nom;
        types.add(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Type> getFortContre() {
        return fortContre;
    }

    public void setFortContre(ArrayList<Type> fortContre) {
        this.fortContre = fortContre;
    }

    public ArrayList<Type> getFaibleContre() {
        return faibleContre;
    }

    public void setFaibleContre(ArrayList<Type> faibleContre) {
        this.faibleContre = faibleContre;
    }

    public static ArrayList<Type> getTypes() {
        return types;
    }

    public static void setTypes(ArrayList<Type> types) {
        Type.types = types;
    }
}

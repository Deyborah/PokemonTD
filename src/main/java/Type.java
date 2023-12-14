import java.util.ArrayList;

public class Type {
    public String nom;
    protected ArrayList<Type> fortContre = new ArrayList<Type>();
    protected ArrayList<Type> faibleContre =new ArrayList<Type>();

    public Type(String nom){
        this.nom = nom;
    }

    public static void initialiserTypes(){
        Type feu = new Type("feu");
        Type eau = new Type("eau");
        Type plante = new Type("plante");


        feu.faibleContre.add(eau);
        feu.fortContre.add(plante);

        eau.faibleContre.add(plante);
        eau.fortContre.add(feu);

        plante.faibleContre.add(feu);
        plante.fortContre.add(eau);
    }
}

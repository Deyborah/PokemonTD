import java.util.ArrayList;

public class Type {
    public String nom;
    protected ArrayList<Type> fortContre = new ArrayList<Type>();
    protected ArrayList<Type> faibleContre =new ArrayList<Type>();

    public static ArrayList<Type> types = new ArrayList<>();

    public Type(String nom){
        this.nom = nom;
        types.add(this);
    }


}

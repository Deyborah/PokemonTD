public class Attaque {

    public String nom;
    public Type type;
    protected int degatsMin;
    protected int degatsMax;

    public Attaque(String nom, Type type, int degatsMin, int degatsMax){
        this.nom = nom;
        this.type = type;
        this.degatsMin = degatsMin;
        this.degatsMax = degatsMax;
    }
}
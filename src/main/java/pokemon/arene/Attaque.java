package pokemon.arene;

import pokemon.type.Type;

public class Attaque {

    public String nom;
    public Type type;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getDegatsNormal() {
        return degatsNormal;
    }

    public void setDegatsNormal(int degatsNormal) {
        this.degatsNormal = degatsNormal;
    }

    protected  int degatsNormal;

    public Attaque(String nom, Type type, int degatsNormal){
        this.nom = nom;
        this.type = type;
        this.degatsNormal = degatsNormal;
    }

}


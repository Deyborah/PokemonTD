package especes;

import java.util.Random;

public abstract class Pokemon {

    protected String nom;
    protected int pvMax;
    protected int pvRestant;

    //TODO : Ajouter le type

    //TODO : Ajouter List<Attaque>

    protected Pokemon() {
        this.pvMax = getRandomNumber();
        this.pvRestant = this.pvMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getPvRestant() {
        return pvRestant;
    }

    public void setPvRestant(int pvRestant) {
        this.pvRestant = pvRestant;
    }
    protected Pokemon(String nom) {
        this.nom = nom;
    }

    /**
     * Méthode permettant d'utiliser une attaque contre un autre pokemon
     * Pas de paramètre => choix d'une attaque aléatoire en fonction de la liste d'attaque du Pokemon
     * Consigne :
     * - afficher les dégats
     * - afficher si force/faiblesse
     * - afficher pdv restant
     */
    public static void attaquer(){

    }

    /**
     * Méthode permettant d'utiliser une attaque contre un autre pokemon
     * Paramètre => choix d'une attaque parmi de la liste d'attaque du Pokemon
     * Consigne :
     * - afficher les dégats
     * - afficher si force/faiblesse
     * - afficher pdv restant
     */
    public static void attaquer(String nomAttaque){

    }

    /**
     * Méthode permettant de retourner un nombre aléatoire entre 40 et 45
     * @return
     */
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5 - 0) + 40;
    }
}

package pokemon;

import pokemon.pokemons.especes.Bulbizarre;
import pokemon.pokemons.especes.Carapuce;
import pokemon.pokemons.especes.Salameche;

public class Main {
    public static void main(String[] args ){

        /**
         * Test Bulbizarre avec paramètre
         */
        Bulbizarre bulbi = new Bulbizarre("bulbi");
        System.out.println("Nom : " + bulbi.getNom());
        System.out.println("PV : " + bulbi.getPvMax());
        System.out.println("Type : " + bulbi.getType().getNom());
        System.out.println("Liste des attaques : ");
        for (int index = 0; index < bulbi.getAttaque().size(); index++){
            System.out.println(bulbi.getAttaque().get(index).getNom());
        };
        System.out.println("---------------------------------");

        /**
         * Initialisation Carapuce avec paramètre
         */
        Carapuce cara = new Carapuce("cara");
        System.out.println("Nom : " + cara.getNom());
        System.out.println("PV : " + cara.getPvMax());
        System.out.println("Type : " + cara.getType().getNom());
        System.out.println("Liste des attaques : ");
        for (int index = 0; index < cara.getAttaque().size(); index++){
            System.out.println(cara.getAttaque().get(index).getNom());
        };
        System.out.println("---------------------------------");

        /**
         * Initialisation Salameche sans paramètre
         */
        Salameche salemeche = new Salameche();
        System.out.println("Nom : " + salemeche.getNom());
        System.out.println("PV : " + salemeche.getPvMax());
        System.out.println("Type : " + salemeche.getType().getNom());
        System.out.println("Liste des attaques : ");
        for (int index = 0; index < salemeche.getAttaque().size(); index++){
            System.out.println(salemeche.getAttaque().get(index).getNom());
        };


    }
}

package pokemon;

import pokemon.pokemons.especes.Bulbizarre;
import pokemon.pokemons.especes.Carapuce;
import pokemon.pokemons.especes.Salameche;

public class Main {
    public static void main(String[] args ){

        Bulbizarre test = new Bulbizarre("test");
        System.out.println(test.getNom());
        System.out.println(test.getPvMax());
        System.out.println(test.getType().getNom());
        for (int index = 0; index < test.getAttaque().size(); index++){
            System.out.println(test.getAttaque().get(index).getNom());
        };


        Carapuce test2 = new Carapuce("cara");
        System.out.println(test2.getNom());
        System.out.println(test2.getPvMax());
        System.out.println(test2.getType().getNom());

        Salameche test3 = new Salameche();
        System.out.println(test3.getNom());
        System.out.println(test3.getPvMax());
        System.out.println(test3.getType().getNom());
        for (int index = 0; index < test3.getAttaque().size(); index++){
            System.out.println(test3.getAttaque().get(index).getNom());
        };


    }
}

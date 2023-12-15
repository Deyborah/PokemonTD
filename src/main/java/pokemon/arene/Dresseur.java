package pokemon.arene;

import java.util.Random;
import java.util.ArrayList;

public class Dresseur {
    protected String nom;
    protected ArrayList<Dresseur> pokemon = new ArrayList<Dresseur>();

    public Dresseur(
            String nom
    ) {
        this.nom = nom;

    }

    /**
     * Fonction qui sert à donner un chiffre aléatoire entre 0 et 6, plus ajout de plus 1 si n le nombre=0
     *
     */
   public static void nombrePokemon() {

        // génération d'un nombre >= 0 et < 6
        Random r = new Random();
        int n = r.nextInt(6);
        if (n == 0) {
            n = 1;
        }
        System.out.println(n);
    }

   /* public static void changerPokemon{
         String listedresseur= ArrayList<pokemon.arene.Dresseur> pokemon;
    }
*/

}
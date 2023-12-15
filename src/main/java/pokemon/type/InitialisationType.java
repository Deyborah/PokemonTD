package pokemon.type;

import pokemon.arene.Attaque;
import pokemon.type.Type;

import java.util.ArrayList;

public class InitialisationType {

    public void initialiserDonnees(){

        //Initialisation des Types
        Type feu = new Type("feu");
        Type eau = new Type("eau");
        Type plante = new Type("plante");
        Type normal = new Type("normal");


        //Initialisation de la liste de la faiblesse du type feu
        ArrayList<Type> listeFaibleFeu = new ArrayList<>();
        listeFaibleFeu.add(eau);
        feu.setFaibleContre((listeFaibleFeu));
        //Initialisation de la liste de la force du type feu
        ArrayList<Type> listeFortFeu = new ArrayList<>();
        listeFortFeu.add(plante);
        feu.setFortContre(listeFortFeu);

        //Initialisation de la liste de la faiblesse du type eau
        ArrayList<Type> listeFaibleEau = new ArrayList<>();
        listeFaibleEau.add(plante);
        eau.setFaibleContre((listeFaibleEau));
        //Initialisation de la liste de la force du type eau
        ArrayList<Type> listeFortEau = new ArrayList<>();
        listeFortEau.add(feu);
        eau.setFortContre(listeFortEau);

        //Initialisation de la liste de la faiblesse du type plante
        ArrayList<Type> listeFaiblePlante = new ArrayList<>();
        listeFaiblePlante.add(feu);
        plante.setFaibleContre((listeFaiblePlante));
        //Initialisation de la liste de la force du type plante
        ArrayList<Type> listeFortPlante = new ArrayList<>();
        listeFortPlante.add(eau);
        plante.setFortContre(listeFortPlante);

    }

}

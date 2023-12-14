public class Init {

    public void initialiserDonnees(){

        Type feu = new Type("feu");
        Type eau = new Type("eau");
        Type plante = new Type("plante");
        Type normal = new Type("normal");


        feu.faibleContre.add(eau);
        feu.fortContre.add(plante);

        eau.faibleContre.add(plante);
        eau.fortContre.add(feu);

        plante.faibleContre.add(feu);
        plante.fortContre.add(eau);

        Attaque griffe = new Attaque("griffe", normal, 5, 10);
        Attaque charge = new Attaque("charge", normal, 2, 5);
        Attaque lanceFlamme = new Attaque("lance-flamme", feu, 5, 10);
        Attaque pistoletAEau = new Attaque("pistolet à eau", eau, 5, 10);
        Attaque fouetLianes = new Attaque("fouet lianes", plante, 5, 10);


    }

}

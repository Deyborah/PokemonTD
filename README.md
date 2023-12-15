# PokemonTD

@startuml

title Pokemon

abstract class Pokemon{
+id : int
+nom : String
+pvMax : int
+pvRestant : int
+type: Type
+attaques : List<Attaque>
+attaquer()
+attaquer(Attaque attaque)
}

class Salameche extends Pokemon {
}

class Carapuce extends Pokemon {
}

class Bulbizarre extends Pokemon {
}

class Type{
+nomType : String
+forceContre : List<Type>
+faiblesseContre : List<Type>

+getForcerContre();
+getFaiblesseContre();
}

class Attaque{
+String nom;
+Type type;
+int degats;
}

class Dresseur{
+id : int
+prenom  :String
+nomType : String
+listPokemon : List<Pokemon>

+attaquerAvecPokemonCourant()
+changerPokemon();
+consulterStats();
}

class Arene {
+Dresseur : dresseur1;
+Dresseur : dresseur2;
+String : nom;
+boolean : combatEnCours;
+int tour;
}

Type --o Pokemon
Type --o Type
Pokemon --o Dresseur
Pokemon --o Attaque
Attaque --o Type
Arene --o Dresseur

@enduml

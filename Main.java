public class Main {
    public static void main(String[] args) {
        // creates the pokemon charmander and raichu
        Pokemon charmander = new Pokemon(false, false, 30, "Charmander");
        Pokemon raichu = new Pokemon(false, false, 90, "Raichu");
        // creates the new Trainer named Kai (totally a randomly generated name)
        Trainer Kai = new Trainer("Kai", "B", "Hoshijo", false);

        System.out.println(charmander.compare(raichu));
        System.out.println(Kai.toString());

    }
}

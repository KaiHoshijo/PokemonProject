public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon(false, false, 30, "Charmander");
        Pokemon raichu = new Pokemon(false, false, 90, "Raichu");
        Trainer Kai = new Trainer("Kai", "B", "Hoshijo", false);

        System.out.println(charmander.compare(raichu));
        System.out.println(Kai.toString());

    }
}

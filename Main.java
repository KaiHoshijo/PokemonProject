public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon(false, false, 52);
        Pokemon raichu = new Pokemon(false, false, 90);

        compare(charmander, raichu);

    }

    public static void compare(Pokemon poke1, Pokemon poke2) {
        if (poke1.getHitPoints() > poke2.getHitPoints()) {
            System.out.println("Pokemon 1 has higher hit points");
        } else if (poke2.getHitPoints() < poke2.getHitPoints()) {
            System.out.println("Pokemon 2 has less hit points");
        } else {
            System.out.println("Equal hit points");
        }
    }
}

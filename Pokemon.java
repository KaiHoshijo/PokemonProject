public class Pokemon {
    // fields used for the program
    private boolean isFishing;
    private boolean isFighting;
    private int hitPoints;
    private String name;

    // the constructor used to initialize the fields through paramets
    public Pokemon(boolean isFishing, boolean isFighting, int hitPoints, String name) {
        this.isFishing = isFishing;
        this.isFighting = isFighting;
        this.hitPoints = hitPoints;
        this.name = name;
        
        // ensures that hitPoints is never over 255
        this.tooHigh();

    }

    // accessor damage function
    public void damage(int amountOfDamage) {
        this.hitPoints -= amountOfDamage;
        if (this.hitPoints < 0) this.hitPoints = 0;
    }

    // getter functions 
    public int getHitPoints() {
        return this.hitPoints;
    }

    public String getName() {
      return this.name;
    }

    // to String method
    public String toString() {
        return "Is fishing: " + this.isFishing + "Is fighting: " + this.isFighting + "Hit points: " + this.hitPoints;
    }

    // compares two Pokemon and their respective hit points
    public String compare(Pokemon poke2) {
        if (this.getHitPoints() != poke2.getHitPoints()) {
            String tempName = this.getHitPoints() > poke2.getHitPoints() ? this.getName() : poke2.getName();
           return tempName + " has higher hit points";
        }
        return "Equal hit points";
    }

    // ensures that the hit points aren't too high
    private void tooHigh() {
      if (this.hitPoints > 255) {
        System.out.println("You set the value too high! Setting it to 255");
        this.hitPoints = 255;
      }
    }

}

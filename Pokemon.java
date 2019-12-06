public class Pokemon {
    private boolean isFishing;
    private boolean isFighting;
    private int hitPoints;

    public Pokemon(boolean isFishing, boolean isFighting, int hitPoints) {
        this.isFishing = isFishing;
        this.isFighting = isFighting;
        this.hitPoints = hitPoints;


    }

    public void damage(int amountOfDamage) {
        this.hitPoints -= amountOfDamage;
        if (this.hitPoints < 0) this.hitPoints = 0;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public String toString() {
        return "Is fishing: " + this.isFishing + "Is fighting: " + this.isFighting + "Hit points: " + this.hitPoints;
    }

}

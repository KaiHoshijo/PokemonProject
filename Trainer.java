public class Trainer {
  private String firstName;
  private String middleInitial;
  private String lastName;
  private boolean hasPlayed;

  public Trainer(String firstName, String mI, String lastName, boolean hasPlayed) {
    this.firstName = firstName;
    this.middleInitial = mI;
    this.lastName = lastName;
    this.hasPlayed = hasPlayed;
  }

  public String toString() {
    String yesPlayed = this.hasPlayed ? "" : " not";
    return firstName+ " " + middleInitial + " " + lastName + " has" + yesPlayed + " played before!";
  }
}
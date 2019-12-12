public class Trainer {
  // fields
  private String firstName;
  private String middleInitial;
  private String lastName;
  private boolean hasPlayed;

  // didn't want to leave it as just fields
  public Trainer(String firstName, String mI, String lastName, boolean hasPlayed) {
    // initializes the fields with given parameters
    this.firstName = firstName;
    this.middleInitial = mI;
    this.lastName = lastName;
    this.hasPlayed = hasPlayed;
  }

  // to String method for the Trainer class
  public String toString() {
    String yesPlayed = this.hasPlayed ? "" : " not";
    return firstName+ " " + middleInitial + " " + lastName + " has" + yesPlayed + " played before!";
  }
}

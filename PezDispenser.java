public class PezDispenser {
    private String characterName = "Yoda";
    public String getCharacterName () {
        return characterName;
    }

    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser.");
        PezDispenser dispenser = new PezDispenser();
        dispenser.characterName = "Darth Vader";
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
    }

}

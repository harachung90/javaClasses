public class PezDispenser {
    public static final int MAX_PEZ = 12;
    final String characterName;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
    }
    public String getCharacterName () {
        return characterName;
    }

/*    public String swapHead(String characterName) {
        String originalCharacterName = this.characterName;
        this.characterName = characterName;
        return originalCharacterName;
    }*/


    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser.");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n",
                PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Scarlet Witch");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
/*        String before = dispenser.swapHead("Darth Vader");
        System.out.printf("It was %s, but Hara switched it to %s %n",
                before, dispenser.getCharacterName());*/
    }
}

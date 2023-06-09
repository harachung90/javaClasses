public class PezDispenser {
    public static final int MAX_PEZ = 12;
    final String characterName;
    private int pezCount;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        fill(MAX_PEZ);
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public String getCharacterName () {
        return characterName;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many PEZ!");
        }
        pezCount = newAmount;
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

        if (dispenser.isEmpty()) {
            System.out.println("Dispense is empty!");
        }

        System.out.println("Filling the dispense with delicious PEZ...");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("Dispense is full.");
        } while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ!");
        }

        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        try {
            dispenser.fill(300);
            System.out.println("This will never happen!");
        } catch (IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The error was %s", iae.getMessage());
        }

    }
}

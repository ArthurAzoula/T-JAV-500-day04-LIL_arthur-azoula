public class Animal {

    protected String name;

    protected int legs;

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD;
    }

    protected Type type;

    private static int numberOfAnimals = 0;

    private static int numberOfMammals = 0;

    private static int numberOfFish = 0;

    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;
        System.out.println("My name is " + this.name + " and I am a " + this.getType() + "!");
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.name().toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumberOfAnimals() {
        if (numberOfAnimals < 2) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public int getNumberOfMammals() {
        if (numberOfMammals < 2) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;
    }

    public int getNumberOfFish() {
        if (numberOfFish < 2) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }

    public int getNumberOfBirds() {
        if (numberOfBirds < 2) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }

}

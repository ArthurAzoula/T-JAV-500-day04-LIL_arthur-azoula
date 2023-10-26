import java.util.Objects;

public class Shark extends Animal {

    private boolean frenzy = false;
    public Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean blood) {
        this.frenzy = blood;
    }

    public void status() {
        if (this.frenzy) {
            System.out.println(this.getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(this.getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        return this != animal;
    }

    public void eat(Animal animal) {
        if (this.canEat(animal)) {
            this.frenzy = false;
            System.out.println(this.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
        } else {
            System.out.println(this.getName() + ": It's not worth my time.");
        }
    }

}

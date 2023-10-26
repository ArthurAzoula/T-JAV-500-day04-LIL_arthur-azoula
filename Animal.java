public class Animal {

    protected String name;

    protected int legs;

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD;
    }

    protected Type type;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
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



}

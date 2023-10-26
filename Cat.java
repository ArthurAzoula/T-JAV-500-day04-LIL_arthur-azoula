public class Cat extends Animal {

    private String color = "grey";

    public Cat(String name) {
        super(name, 4, Type.MAMMAL);
        System.out.println(name + ": MEEEOOWWWW");
    }

    public Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);
        this.color = color;
        System.out.println(name + ": MEEEOOWWWW");
    }

    public String getColor() {
        return this.color;
    }

    public void meow() {
        System.out.println(this.getName() + " the " + this.getColor() + " kitty is meowing.");
    }


}


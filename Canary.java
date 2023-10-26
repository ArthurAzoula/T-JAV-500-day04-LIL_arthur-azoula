public class Canary {

    private int eggs;

    public Canary(String name) {
        super(name, 2, Type.BIRD);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }

    public void layEgg() {
        this.eggs++;
    }

    public int getEggsCount() {
        return eggs;
    }
}
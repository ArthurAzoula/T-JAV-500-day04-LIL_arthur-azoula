import java.util.Objects;

public class BlueShark extends Shark {


    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return !animal.getType().equals("fish") && super.canEat(animal);
    }
}

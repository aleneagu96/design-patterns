package abstractfactory.example.pizza;

public class Tonno extends Pizza {

    private final int size;

    public Tonno(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "Tonno";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngredients() {
        return "Cheese, Tomato Sauce, Tuna";
    }
}



package abstractfactory.example.factories;

import abstractfactory.example.pizza.Pizza;
import abstractfactory.example.pizza.Tonno;

public class TonnoFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Tonno(size);
    }
}




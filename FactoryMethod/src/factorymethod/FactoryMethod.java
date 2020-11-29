package factorymethod;

import factorymethod.example.Pizza;
import factorymethod.example.PizzaFactory;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactory factoris = new PizzaFactory();
        Pizza margharita = factoris.getPizza(1);
        Pizza capriciosa = factoris.getPizza(2);
        Pizza fruttiDiMare = factoris.getPizza(3);
        Pizza tonno = factoris.getPizza(4);
        System.out.println(margharita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());
        System.out.println(fruttiDiMare.getDetectedPizza());
        System.out.println(tonno.getDetectedPizza());
    }

}
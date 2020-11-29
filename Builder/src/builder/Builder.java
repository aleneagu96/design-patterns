package builder;

import builder.example.Pizza;
import builder.exercise.Block;
import builder.exercise.BlockPen;

import java.awt.*;

public class Builder {

    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50).addChees(true)
                .addSauce(true).takeaway(true).build();
        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42).addChees(true)
                .addSauce(false).takeaway(false).build();
        System.out.println(margharita);
        System.out.println(capriciosa);

        BlockPen square = new BlockPen.BlockPenBuilder("Square").setShape("Square").setColor(Color.PINK).setPenWidth(7).build();
        BlockPen rectangle = new BlockPen.BlockPenBuilder("Rectangle").setShape("Rectangle").setColor(Color.BLUE).setPenWidth(12).build();
        System.out.println(square);
        System.out.println(rectangle);
//        Block square2 = new Block.BlockBuilder("Square").setShape("Square").setColor(Color.RED).setPenWidth(10).build();
        //Block circle = new Block.BlockBuilder("Circle").setColor(Color.GREEN).setPenWidth(20).build();
//        System.out.println(square2);
        //System.out.println(circle);
    }
}

package builder.exercise;

import java.awt.*;

public class BlockPen {

    private final String name;
    private final String shape;
    private final Color color;
    private final Integer penWidth;

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape == null ? "" : shape;
    }

    public Color getColor() {
        return color == null ? Color.BLUE : color;
    }

    public int getPenWidth() {
        return penWidth == null ? 0 : penWidth;
    }

    @Override
    public String toString() {
        return "BlockPen= " + this.getName()
                + ", Shape= " + this.getShape()
                + ", Color= " + this.getColor()
                + " PenWidth= " + this.getPenWidth();
    }

    private BlockPen(BlockPenBuilder builder) {
        this.name = builder.name;
        this.shape = builder.shape;
        this.color = builder.color;
        this.penWidth = builder.penWidth;
    }

    public static class BlockPenBuilder {

        private String name;

        private String shape;
        private Color color;
        private Integer penWidth;


        public BlockPenBuilder(String name) {
            this.name = name;
        }

        public BlockPenBuilder setShape(String shape) {
            this.shape = shape;
            return this;
        }


        public BlockPenBuilder setColor(Color color) {
            this.color = color;
            return this;
        }

        public BlockPenBuilder setPenWidth(Integer penWidth) {
            this.penWidth = penWidth;
            return this;
        }

        public BlockPen build() {
            return new BlockPen(this);
        }
    }
}
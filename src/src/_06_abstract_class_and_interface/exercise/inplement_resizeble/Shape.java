package _06_abstract_class_and_interface.exercise.inplement_resizeble;

import _06_abstract_class_and_interface.exercise.inplement_resizeble.Resizeble;

public abstract class Shape implements Resizeble {
    private String color = "red";
    private boolean filled = false;

    @Override
    public void resize(double percent) {
    }

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape: " +
                "color='" + color + '\'' +
                ", filled=" + filled
                ;
    }
}

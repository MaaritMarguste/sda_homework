package Muzzle;

public class Muzzle {
private int length;
private String color;

//test

    public Muzzle(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void seLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Muzzle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}

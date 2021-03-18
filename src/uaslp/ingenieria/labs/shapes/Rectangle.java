package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public int getSidesCount() {
        return 4;
    }

    public int getPerimeter() {
        return ((this.base*2) + (this.height*2));
    }

    public double getArea() {
        return (this.base * this.height);
    }
}

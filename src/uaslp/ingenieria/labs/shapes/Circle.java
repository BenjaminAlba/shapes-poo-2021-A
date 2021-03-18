package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

    public int getPerimeter()
    {
        //can't use pi if it's an int, but it's too much of a hassle to change everything
        return (3*(this.radio*(2)));
    }

    public int getSidesCount()
    {
        return 0;
    }

    public double getArea()
    {
        return (3.1416*(this.radio^(2)));
    }
}

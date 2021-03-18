package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle
{
    private int side;
    private int differentSide;

    public IsoscelesTriangle(int side, int differentSide)
    {
        this.side = side;
        this.side = differentSide;
    }

    public String getName()
    {
        return "Triangle Isosceles";
    }

    public int getSidesCount()
    {
        return 3;
    }

    public int getPerimeter()
    {
        return this.side*2 + this.differentSide;
    }

    public double getArea()
    {
        return ((this.differentSide*(((this.side^(2))-((this.differentSide^(2))/4)^(1/2)))/2));
    }
}

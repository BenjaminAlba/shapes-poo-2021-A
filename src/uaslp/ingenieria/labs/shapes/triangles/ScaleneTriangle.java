package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private int side;
    private int side2;
    private int side3;

    public ScaleneTriangle(int side, int side2, int side3) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getName() {
        return "Triangle Scalene";
    }

    public int getSidesCount() {
        return 3;
    }

    public int getPerimeter() {
        return this.side + this.side2 + this.side3;
    }

    public double getArea()
    {
        return ((((this.side + this.side2 + this.side3)/2)*(((this.side + this.side2 + this.side3)/2)-this.side)*(((this.side + this.side2 + this.side3)/2)-this.side2)*(((this.side + this.side2 + this.side3)/2)-this.side3))^(1/2));
    }
}

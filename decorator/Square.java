package com.company;
import static java.lang.Math.*;

public class Square implements SquareInterface {
    private int side;

    public Square(int side)
    {
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    public double diagonal()
    {
        return round(sqrt(side * side + side * side) * 100);
    }

    public String toString()
    {
        return "(width: " + side + ", height: " + side + ")";
    }
}

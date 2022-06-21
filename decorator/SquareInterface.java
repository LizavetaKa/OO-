package com.company;

import static java.lang.Math.*;

public interface SquareInterface {
    double getSide();
    double diagonal();

    default double Square()
    {
        return getSide() * getSide();
    }
}

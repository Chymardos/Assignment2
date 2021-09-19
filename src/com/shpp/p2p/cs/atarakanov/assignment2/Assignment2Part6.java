package com.shpp.p2p.cs.atarakanov.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {

    /* The default number of caterpillar cells count */
    private static final int CATERPILLAR_CELLS_NUMBER = 5;
    /* The default number of caterpillar cell diameter */
    private static final int CELL_DIAMETER = 75;

    /* The default width and height of the window */
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 300;

    /* Main method */
    public void run() {
        createCaterpillar();
    }

    /* Method that creates whole caterpillar */
    private void createCaterpillar() {
        for (int i = 0; i < CATERPILLAR_CELLS_NUMBER; i++) {
            upper_Part(i);
            bottom_Part(i);
        }
    }

    /* Set of parameters for upper part of caterpillar */
    private void upper_Part(int i) {
        double margin_x = 1.2 * CELL_DIAMETER * i;
        createUpper(margin_x);
    }

    /* Set of parameters for bottom part of caterpillar */
    private void bottom_Part(int i) {
        double margin_x = CELL_DIAMETER / 2.0 + 1.2 * CELL_DIAMETER * i;
        createBottom(margin_x);
    }

    /* Method that creates caterpillar circles for bottom */
    private void createUpper(double margin_x) {
        GOval Circle = new GOval(margin_x, CELL_DIAMETER * 1.5, CELL_DIAMETER, CELL_DIAMETER);
        Circle.setColor(Color.RED);
        Circle.setFilled(true);
        Circle.setFillColor(Color.GREEN);
        add(Circle);
    }

    /* Method that creates caterpillar circles for upper */
    private void createBottom(double margin_x) {
        GOval Circle = new GOval(margin_x, CELL_DIAMETER, CELL_DIAMETER, CELL_DIAMETER);
        Circle.setColor(Color.RED);
        Circle.setFilled(true);
        Circle.setFillColor(Color.GREEN);
        add(Circle);
    }
}



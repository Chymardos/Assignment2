package com.shpp.p2p.cs.atarakanov.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    /* The default width and height of the window. */
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    /* Main method */
    public void run() {
        fill_Window_with_boxes();
    }

    /* We're using this method to fill window with boxes */
    private void fill_Window_with_boxes() {
        for (int j = 0; j < NUM_ROWS; j++) {
            double boxUpperSpace = (BOX_SIZE + BOX_SPACING) * j;
            build_Rows(boxUpperSpace);
        }
    }

    /* This method is building rows */
    private void build_Rows(double boxUpperSpace) {
        for (int i = 0; i < NUM_COLS; i++) {
            double boxSideSpace = (BOX_SIZE + BOX_SPACING) * i;
            double marginWidth = getWidth() / 2.0 - ((BOX_SIZE + BOX_SPACING) * NUM_COLS) / 2;
            double marginHeight = getHeight() / 2.0 - ((BOX_SIZE + BOX_SPACING) * NUM_ROWS) / 2;
            boxConstructor(boxUpperSpace, boxSideSpace, marginWidth, marginHeight);
        }
    }

    /* GRect box configurator. We're using this method to construct each box */
    private void boxConstructor(double boxUpperSpace, double boxSideSpace, double marginWidth, double marginHeight) {
        GRect box = new GRect(boxSideSpace + BOX_SPACING / 2 + marginWidth, boxUpperSpace + BOX_SPACING / 2 + marginHeight, BOX_SIZE, BOX_SIZE);
        box.setFilled(true);
        box.setFillColor(Color.BLACK);
        add(box);
    }
}
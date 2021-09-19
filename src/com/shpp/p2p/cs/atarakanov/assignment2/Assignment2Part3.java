package com.shpp.p2p.cs.atarakanov.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {

    /* My program is using GOval to draw pawprints. */

    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */

    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left corner of the pawprint. */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    /* The default width and height of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window. */

    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    /* Main method */
    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /*
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */

    /* Drawing whole illustration */
    private void drawPawprint(double x, double y) {
        createFistToe(x, y);
        createSecondToe(x, y);
        createThirdToe(x, y);
        createHeel(x, y);
    }

    /* Creating First Toe */
    private void createFistToe(double x, double y) {
        GOval FirstToe = new GOval(FIRST_TOE_OFFSET_X + x, FIRST_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        FirstToe.setFilled(true);
        FirstToe.setFillColor(Color.BLACK);
        add(FirstToe);
    }

    /* Creating Second Toe */
    private void createSecondToe(double x, double y) {
        GOval SecondToe = new GOval(SECOND_TOE_OFFSET_X + x, SECOND_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        SecondToe.setFilled(true);
        SecondToe.setFillColor(Color.BLACK);
        add(SecondToe);
    }

    /* Creating Third Toe */
    private void createThirdToe(double x, double y) {
        GOval ThirdToe = new GOval(THIRD_TOE_OFFSET_X + x, THIRD_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        ThirdToe.setFilled(true);
        ThirdToe.setFillColor(Color.BLACK);
        add(ThirdToe);
    }

    /* Creating Heel */
    private void createHeel(double x, double y) {
        GOval Heel = new GOval(HEEL_OFFSET_X + x, HEEL_OFFSET_Y + y, HEEL_WIDTH, HEEL_HEIGHT);
        Heel.setFilled(true);
        Heel.setFillColor(Color.BLACK);
        add(Heel);
    }
}
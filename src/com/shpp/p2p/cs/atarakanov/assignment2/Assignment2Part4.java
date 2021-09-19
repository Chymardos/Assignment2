package com.shpp.p2p.cs.atarakanov.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {

    private static final double FLAG_WIDTH = 500;
    private static final double FLAG_PART_HEIGHT = 120;

    private static final String COUNTRY_NAME_FONT_AND_SIZE = "Arial-25";
    private static final String COUNTRY_NAME = "Estonia";

    private static final Color FIRST_LINE_COLOR = new Color(0, 114, 206);
    private static final Color SECOND_LINE_COLOR = new Color(0, 0, 0);
    private static final Color THIRD_LINE_COLOR = new Color(255, 255, 255);

    /* The default width and height of the window */

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 600;

    /* Main method */
    public void run() {
        parametersCalculate();
        createLabel();
    }

    /* Calculating parameters for stripes */
    public void parametersCalculate() {
        double flagHeight = FLAG_PART_HEIGHT * 3;
        double startPointX = getWidth() / 2.0 - FLAG_WIDTH / 2;
        double startPointY = getHeight() / 2.0 - flagHeight / 2;
        double secondStripeY = startPointY + FLAG_PART_HEIGHT;
        double thirdStripeY = secondStripeY + FLAG_PART_HEIGHT;
        drawFlag(startPointX, startPointY, secondStripeY, thirdStripeY);
    }

    /* Drawing Estonia flag with stripes set parameters */
    private void drawFlag(double startPointX, double startPointY, double secondStripeY, double thirdStripeY) {
        drawStripe(startPointX, startPointY, FIRST_LINE_COLOR);
        drawStripe(startPointX, secondStripeY, SECOND_LINE_COLOR);
        drawStripe(startPointX, thirdStripeY, THIRD_LINE_COLOR);
    }

    /* Draw flag stripe */
    private void drawStripe(double stripeX, double stripeY, Color color) {
        GRect stripe = new GRect(stripeX, stripeY, FLAG_WIDTH, FLAG_PART_HEIGHT);
        stripe.setFilled(true);
        stripe.setFillColor(color);
        add(stripe);
    }

    /* Drawing Label */
    private void createLabel() {
        GLabel Country_Name_Label = new GLabel(COUNTRY_NAME);
        Country_Name_Label.setFont(COUNTRY_NAME_FONT_AND_SIZE);
        add(Country_Name_Label, (getWidth() - Country_Name_Label.getWidth()), (getHeight()));
    }

}
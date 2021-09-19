package com.shpp.p2p.cs.atarakanov.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    /* Declaring program window size (width and height) */
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;


    /* Main part */
    public void run() {

        double radius = getWidth() / 6; // Declaring circle's radius (1/6 of program window width)
        drawTopLeftCircle(radius);
        drawTopRightCircle(radius);
        drawBottomLeftCircle(radius);
        drawBottomRightCircle(radius);
        drawRectangle(radius);
    }

    /* Drawing rectangle */
    private void drawRectangle(double radius) {
        double x = getWidth() - (getWidth() - radius);
        double y = getHeight() - (getHeight() - radius);
        double width = getWidth() - 2 * radius;
        double height = getHeight() - 2 * radius;
        createRectangle(x, y, width, height);
    }

    /* Creates Top Left Circle */
    private void drawTopLeftCircle(double radius) {
        double x = 0;
        double y = 0;
        createCircle(radius, x, y);
    }

    /* Creates Top Right Circle */
    private void drawTopRightCircle(double radius) {
        double x = getWidth() - 2 * radius;
        double y = getHeight() - getHeight();
        createCircle(radius, x, y);
    }

    /* Creates Bottom Left Circle */
    private void drawBottomLeftCircle(double radius) {
        double x = 0;
        double y = getHeight() - 2 * radius;
        createCircle(radius, x, y);
    }

    /* Creates Bottom Right Circle */
    private void drawBottomRightCircle(double radius) {
        double x = getWidth() - 2 * radius;
        double y = getHeight() - 2 * radius;
        createCircle(radius, x, y);
    }

    /* Creates new circle object with colors */
    private void createCircle(double radius, double x, double y) {
        GOval Circle = new GOval(x, y, 2 * radius, 2 * radius);
        Circle.setColor(Color.BLACK);
        Circle.setFilled(true);
        add(Circle);
    }

    /* Creates new rectangle object with colors*/
    private void createRectangle(double x, double y, double width, double height) {
        GRect Rectangle = new GRect(x, y, width, height);
        Rectangle.setFilled(true);
        Rectangle.setFillColor(Color.WHITE);
        Rectangle.setColor(Color.WHITE); // Setting Color of a border
        add(Rectangle);
    }

}



package com.shpp.p2p.cs.atarakanov.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {

    private double a, b, c;

    // Discriminant formula D=b^2-4ac
    //If (Discriminant > 0), then we calculate the roots of the equation x1 and x2 by the formula:
    //x1 = (-b - Math.sqrt(D)) / (2 * a);
    //x2 = (-b + Math.sqrt(D)) / (2 * a);

    //Else If (Discriminant == 0), then the equation has a single root. Let's calculate it by the formula:
    //x = -b / (2 * a);

    //Else (Discriminant < 0) the equation has no real roots.

    /*
     * We are using 3 methods:
     * inputVars - just method, that saves info from input to variables
     * discriminant - using to calculate main formula
     * calculation - using to calculate the roots
     * */

    public void run() {

        /* In the try block we wrap the code in which the exception can occur, in this
        case the compiler tells us that the inputVars() method can throw an I/O exception */

        try {
            inputVars();
        } catch (Exception e) {
            System.out.println("We got exception. Look like there is not a number");
            return;
        }
        calculation();
    }

    //Storing user input
    private void inputVars() throws Exception {
        a = readDouble("Please enter a: (must be a number)");
        b = readDouble("Please enter b: (must be a number)");
        c = readDouble("Please enter c: (must be a number)");
    }

    //Calculating and return discriminant
    private double discriminant() {
        double D = b * b - 4 * a * c;
        return D;
    }

    //Calculating roots
    private void calculation() {
        double D = discriminant();
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            println("There are two roots" + x1 + " and " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            println("There is one root: " + x);
        } else {
            println("There are no real roots.");
        }
    }
}

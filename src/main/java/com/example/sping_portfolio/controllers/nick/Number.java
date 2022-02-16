package com.example.sping_portfolio.controllers.nick;

import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables
    private final int num;
    private final int index;
    public static int indexCount = 0;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        // constructor
        num = (int) (34 * Math.random() + 3);
        index = indexCount;
        indexCount++;
    }

    // It contains a getter for the Random Number
    public int getNum() {
        return num;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        return index;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Number> squirrels = new ArrayList<>();

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops

        for (int i = 0; i < 10; i++) {
            Number squirrel = new Number();
            for (int j = 0; true; j++) {
                if (j == squirrels.size() || (squirrel.getNum() < squirrels.get(j).getNum())) {
                    squirrels.add(j, squirrel);
                    break;
                }
            }
        }

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number i : squirrels) {
            System.out.printf("Squirrels: %d Day: %d\n", i.getNum(), i.getIndex());
        }
    }
}

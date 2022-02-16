import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
class day {
    // Write a Class Number
    public static class Number {
        // instance variables
        private int squirrelNum;
        private int sqIndex;
        private int min = 3;
        private int max = 36;
        // Number has a zero Argument constructor
        // It initializes a random number between 3 and 36, ie the number of squirrels in class
        public Number() {
            // constructor
            Random r = new Random();
            squirrelNum = r.nextInt((max-min)+1)+ min;}
        // It contains a getter for the Random Number
        public Integer getSquirrelNum() {
            return squirrelNum;}

        public void sqIndexSet(int a) {
            sqIndex = a;}

        // It contains a getter for Index, or the order it was initialized
        public Integer getSQIndex() {
            return sqIndex;
        }

        // Write a tester method
        public static void main(String[] args) {

            // Create an ArrayList of Type Number, my ArrayList is called squirrels
            ArrayList<Number> squirrels = new ArrayList<Number>();

            // Initialize 10 squirrels of class type Number
            int arraySize = 10;

            // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
            for(int i = 0; i<arraySize;i++) {
                Number n = new Number();
                n.sqIndexSet(i);
                squirrels.add(n);
            }
            Collections.sort(squirrels, Comparator.comparing(Number::getSquirrelNum));
            // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
            for(Number x: squirrels) {
                System.out.println("squirrels:"+ x.getSquirrelNum()+" day: "+x.getSQIndex());
            }
        }

    }
}
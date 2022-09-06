package calculator;

import java.util.Random;

public class Main3 {
    static Random random= new Random();
    public static void main(String[] args) {
        LogicalOperations logicalOperations = new LogicalOperations();
        Calculator calc= new Calculator();

        int randomNumber= random.nextInt(9);
        System.out.println("Random number is: ");
        System.out.println("The random number from keyboard is: "+logicalOperations.numberFromKeyboard(randomNumber));
    }



}

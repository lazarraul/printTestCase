package ro.fasttrackit;
import java.util.Scanner;
import java.math.*;

public class Tema2 {
    public static void main(String[] args) {

        //check if is a palindrom number

        int num = 121, reversedNum = 0, remainder;

        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }

        //Calculate the sum of the first 100 prime numbersAssignment

        int sum = 1;
        int ctr = 0;
        int number = 0;

        while (ctr < 100) {
            number++;
            if (number % 2 != 0) {
                // check if the number is even
                if (is_Prime(number)) {
                    sum += number;
                    ctr++;
                }
            }
        }
        System.out.println("\nSum of the first 100 prime numbers is: "+sum);
    }

    public static boolean is_Prime(int num) {
        for (int i = 3; i * i <= num; i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

        //

        public class Calculator
        {
            private static final Scanner askScanner = new Scanner(System.in);
            public static double answer;
            public static double firstNumber;
            public static double secondNumber; //makes variables for the whole class

            public static void main(String[] args) {
                calculator();
            }

            public static void calculator() {



                System.out.println("Basic calculator");
                System.out.println("Pick one:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                int pick = askScanner.nextInt();

                if(pick == 1) {
                    addition();
                }
                else if(pick == 2) {
                    subtraction();
                }
                else if(pick == 3) {
                    multiplication();
                }
                else if(pick == 4) {
                    division();
                }
                else {
                    System.out.println("You need to choose 1, 2, 3, or 4");
                    calculator();
                }
                askScanner.close();
            }

            private static double getNumbers() {
                System.out.println("First number?");
                firstNumber = askScanner.nextDouble();
                System.out.println("Second Number?");
                secondNumber = askScanner.nextDouble();
                return firstNumber;
            }

            public static void subtraction() {
                System.out.println("Subtraction");
                getNumbers();
                answer = firstNumber - secondNumber;
                System.out.println("This is the difference of the two numbers:  " + answer);
                calculator();
            }

            public static void addition() {
                System.out.println("Addition");
                getNumbers();
                answer = firstNumber + secondNumber;
                System.out.println("This is the sum of the two numbers:  " + answer);
                calculator();
            }

            public static void multiplication() {
                System.out.println("Multiplication");
                getNumbers();
                answer = firstNumber * secondNumber;
                System.out.println("This is the product of the two numbers  " + answer);
                calculator();
            }

            public static void division() {
                System.out.println("Division");
                getNumbers();
                answer = firstNumber / secondNumber;
                System.out.println("This is the quotient of the two numbers:    " + answer);
                calculator();
            }

        }

    }
    }


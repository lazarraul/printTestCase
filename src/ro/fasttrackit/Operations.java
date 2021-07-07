package ro.fasttrackit;

//import java.util.Arrays;

public class Operations {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("not enough numbers to calculate");
        }


//tema gasim solutia

        //byte test =126;
        //short test1 =1;
        //int test2 = 22;
        // long test3 = 2000000;
        // float test4 = 2.1f;
        // double test5 = 21.22222;
        // boolean test6 = false;
        // boolean test7 = true;

        System.out.println("First arg :" + args[0]);
        System.out.println("Second arg :" + args[1]);
        System.out.println("Third arg :" + args[2]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        int sum = a + b;
        int decrease = a - b;
        int prod = a * b;
        int modul = a % b;

        int z=0;

        int numberString[] = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        System.out.print("this is our string : ");
        for (int i = 0; i < numberString.length; i++) {
            System.out.print(numberString[i] + ", ");
        }


        int x = 9;
        for(int i = 2; i<x; i++) {
            if (x % i == 0)
                System.out.println("\n Not a prime number ");
            else {
                 z = z + x % i;
            }
            break;

        }
        if (z!=0){
            System.out.println("\n The " + x + " number is prime");
        }
        //Print all prime numbers until a certain given numberAssignment





        int fact=1;
        int f;
        for(f=1;f<=a;f++)
        {
            fact=f*f+1;
        }
        System.out.println("\n Factorial number is:"  +fact);
        //Calculate the Factorial of a number using command-line argumentsAssignment





        System.out.println();
        if(c !=0) {
            float division = prod / c;
            System.out.println(division);
        } else {
            System.out.println("\nDivision cannot be executed");
        }
        //Verify that the input coming into your application is different than 0Assignment

        String nameOfCalculator = "Digital Calculator";
        System.out.print(nameOfCalculator+ "Sum is:"+ sum + "decrease is "+ decrease);
        System.out.println("\n Modul : "+modul);


            }





}


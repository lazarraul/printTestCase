package ro.fasttrackit;

public class Tema {
    public static void main(String[] args) {

        //Verify that the input coming into your application is different than 0Assignment
        int firstArgs = 4;
        int secondArgs = 4;
        int thirdArgs = 0;
        //int z=0;

        int numberString[] = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        System.out.print("This is our string : ");
        for (int i = 0; i < numberString.length; i++) {
            System.out.print(numberString[i] + ", ");
        }
        System.out.println();

        int n = numberString.length;
        System.out.print("\n even number: ");
        for (int i = 0; i < n; i++) {
            if (numberString[i] % 2==0)
                System.out.print(numberString[i] + ",");
        }System.out.println();

        System.out.print("\n odd numbers: ");
        for(int i = 0; i < n; i++) {
            if (numberString[i] % 2 == 1)
                System.out.print(numberString[i] + ",");
        }
        System.out.println();
        //Print all even numbers that exists until a given numberAssignment


        if (thirdArgs != 0) {
            float division = secondArgs / thirdArgs;
            System.out.println(division);
        } else {
            System.out.println("\nDivision cannot be executed");
        }
        //Verify that the input coming into your application is different than 0Assignment

        int fact=1;
        int f;
        for(f=1;f<=firstArgs;f++)
        {
            fact=fact*f;
        }
        System.out.println("\n Factorial number is:"  +fact);

        //Calculate the Factorial of a number using command-line argumentsAssignment

     /*   int x = 9;
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


      */
        System.out.println();
        //Print all prime numbers until a certain given numberAssignment

        int i = 0,m=0,flag=0;

        m=numberString[i]/2;

        for(i = 2; i <= n; i++) {
            if (numberString[i] == 0 || numberString[i] == 1) {
                System.out.println(numberString[i]+" is not prime number");
            }else{
                    if(numberString[i]%i==0){
                        System.out.println(numberString[i]+" is not prime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  { System.out.println(numberString[i]+" is prime number"); }
            }//end of else


            }
        }












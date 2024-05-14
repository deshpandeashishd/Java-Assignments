package Assignments_RKP;

import java.util.Scanner;

public class Factorial_14 {

    public static void main(String[] args) {


        /*Logic:
        5! = 5*4*3*2*1
        number

        */

        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int Number = Scan.nextInt();
        int Fact = 1;
        for (int i =1; i<=Number;i++)
        {
            Fact = (Fact*i);

        }

        System.out.println("Factorial of "+Number+ " is " +Fact);
    }
}

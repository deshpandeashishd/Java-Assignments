package Assignments_RKP;

import java.util.Scanner;

public class Multiply_Int_1 {

    //Multiply of two int values and print in decimal
    //Logic:
    //Define two integers, Declare result variable as float\double
    //Get input from user and store in 2 variables
    //Calculation store in result variable
    //print output - result variable

    public static void main(String[] args) {
        int a, b;
        float c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Integer:");
        a = scan.nextInt();
        System.out.println("Enter 2nd Integer:");
        b = scan.nextInt();

        c = (a*b);

        System.out.println("Result is " +c);

    }

}

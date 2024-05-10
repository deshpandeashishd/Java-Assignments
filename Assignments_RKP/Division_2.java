package Assignments_RKP;


import java.util.Scanner;

public class Division_2 {

    //Division of 2 numbers and print the exact output
    //Ex: a=15, b=2 then output=7.5
    //Logic:
    //Define two integers, Declare result variable as float\double
    //Get input from user and store in 2 variables
    //Calculation store in result variable ** division gives integer, add modulus with numerator as float
    //print output - result variable
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Integer:");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Integer:");
        int b = scan.nextInt();

        float c = (float)(a/b) + (float)(a % b) /b;

        System.out.println("Result is " +c);

    }


}

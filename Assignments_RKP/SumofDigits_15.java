package Assignments_RKP;

import java.util.Scanner;

//15. Find the sum of all the digits of the given number

public class SumofDigits_15 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Number = Scan.nextInt();
        int Number1 = Number;
        int Rem = 0;
        while (Number1 != 0)
        {
            Rem = Rem + (Number1%10);
            Number1 = Number1/10;

        }

        System.out.println("Sum of digits in "+Number+ " is "+Rem);
    }

}

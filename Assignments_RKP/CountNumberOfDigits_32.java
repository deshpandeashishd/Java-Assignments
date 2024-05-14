package Assignments_RKP;

import java.util.Scanner;

public class CountNumberOfDigits_32 {
    //32. Count the number of digits on the given number

    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int Number = Scan.nextInt();
        int Number1 = Number;
        int count = 0;

        while (Number1 != 0)
        {
            Number1 = Number1/10;
            count = count +1;
        }

        System.out.println("Number of digits in "+Number+ " are " +count );
    }

}

package Assignments_RKP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Year in yyyy format:");
        int Year = scan.nextInt();

        if (Year%4 == 0)
        {
            System.out.println(Year +" is a Leap year.");

        }
        else
        {
            System.out.println(Year +" is not a Leap year.");

        }



    }

}

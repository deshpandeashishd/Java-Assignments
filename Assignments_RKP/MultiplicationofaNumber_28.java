package Assignments_RKP;

import java.util.Scanner;

public class MultiplicationofaNumber_28 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int Number = Scan.nextInt();

        for(int i =1; i<=10;i++)
        {
            System.out.println(Number*i);

        }

    }
}

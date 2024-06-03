package Assignments_RKP.Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String Input = Scan.nextLine();

        String s = "";

        for (int i =0; i<Input.length(); i++)
        {
            s = Input.charAt(i) + s;

        }

        System.out.println(s);

    }

}

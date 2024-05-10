package Assignments_RKP;

import java.util.Scanner;

public class Armstrong_21 {
    //Find the given number is armstrong
    //Ex: n=153, calculation=(1^3)+(5^3)+(3^3)=153. So n=calculated value -> Armstrong
    public static void main(String[] args) {

        //Logic:
        //rem = 153%10 ---> 3, 153/10 ---> 15 ---> cal = 27
        //rem = 15%10 ---> 5, 15/10 ---> 1 ---> cal = 27 + 125 = 152
        //rem = 1%10 ---> 1, 1/10 ---> 0 ---> cal = 152 +1 = 153

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        //int n = 153;
        int m = n; // at the end of while loop n was 0, so loop was failing so had to use another variable
        int cal = 0;

        while(m!=0){

            int rem = m%10;
            m = m/10;
            cal = cal + (rem*rem*rem);
        }
        System.out.println(cal);

        if (cal == n)
        {
            System.out.println(n+ " is Armstrong");
        }
        else
        {
            System.out.println(n+ " is not Armstrong");
        }
    }


}

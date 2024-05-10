package Assignments_RKP;

import java.util.Scanner;

public class Palindrome {
    //Find the number is palindrome or not
    //Ex: n=121. Reverse n, output=121. Now n=output -> Palindrome else not

    //Logic for reverse no -
    //12321%10 = 1, 12321/10 = 1232 ---> 0*10 + 1;  ---> 1
    //1232%10 = 2, 1232/10 = 123 ---> 1*10 + 2  ---> 12
    //123%10 = 3, 123/10 = 12 ---> 12*10 + 3  ---> 123
    //12%10 = 2, 12/10 = 1 ---> 123*10 + 2 ---> 1232
    //1%10 = 1, 1/10 = 0 --->  1232 *10 + 1 ---> 12321

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        //int n = 12321;
        int m = n; // at the end of while loop n was 0, so if loop was failing so had to use another variable
        int rev_no = 0;

        while(m!=0){

            int rem = m%10;
            m = m/10;
            rev_no = (rev_no*10) + rem;

        }
        if (rev_no == n)
        {
            System.out.println(n+ " is Palindrome.");
        }
        else

        {
            System.out.println(n+ " is not Palindrome.");
        }
    }

}

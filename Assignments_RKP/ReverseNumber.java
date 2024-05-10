package Assignments_RKP;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 9857;
        int final_result = 0;
        while (a!=0)
        {
            int rem = a%10;
            a = a/10;
            final_result = final_result *10 + rem;


        }
        System.out.println("Final result is: "+final_result);
    }
}


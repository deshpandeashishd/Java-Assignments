package Assignments_RKP;

public class Neon_Number_23 {
    //Find the number is neon number
    //Ex: n=9, square of n=81-> add both the digits from squared value, results 9. So neon number
    //Logic:
    //int a
    //int square = a^2
    //while loop a%10, a/10, result = result + rem

    public static void main(String[] args) {

        int a = 9 ;
        int b = a;
        int square = a*a;
        int result = 0;

        while(square!=0){

            int rem = square%10;
            square = square/10;

            result = result + rem;

        }

        System.out.println("Result is "+result);

        if (a == result)
        {
            System.out.println(a+ " is Neon Number");
        }
        else

        {
            System.out.println(a+ " is not Neon Number");
        }

    }
}

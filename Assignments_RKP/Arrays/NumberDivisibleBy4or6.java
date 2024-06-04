package Assignments_RKP.Arrays;
//52. Find all the numbers which are either divisible by 4 or 6 or both from an array
public class NumberDivisibleBy4or6 {

    public static void main(String[] args) {

        int[] a1 = {5, 8, 32, 18, 48, 70, 56};

        for (int i = 0; i < a1.length; i++)
        {
            if ((a1[i]%4 == 0) || (a1[i]%6 == 0))
            {
                System.out.print(a1[i]+" ");
            }

        }
    }
}

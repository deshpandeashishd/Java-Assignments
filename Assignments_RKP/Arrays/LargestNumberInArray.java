package Assignments_RKP.Arrays;

public class LargestNumberInArray {

    //51. Find the Smallest number in the array

    public static void main(String[] args) {


        int[] a1 = {2, 8, 32, 7, 9,976, 56};
        int x = a1[0];
        for (int i = 1; i < a1.length; i++) {

                if (x < a1[i])
                {
                    x = a1[i];

                }

            }

        System.out.println(x);

    }
}

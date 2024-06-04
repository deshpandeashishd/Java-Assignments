package Assignments_RKP.Arrays;

import java.util.Arrays;

//54. Given: [1,0,0,1,2,3,0,4,0].Expected output: [0,0,0,0,1,1,2,3,4]
public class ArraySorting_0 {

    public static void main(String[] args) {

        int[] a1 = {1,0,0,1,2,3,0,4,0};
        int[] a2 = Arrays.stream(a1).sorted().toArray();

        for (int z : a2) {
            System.out.print(z+" ");

        }

    }
}

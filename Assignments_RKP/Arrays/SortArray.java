package Assignments_RKP.Arrays;
//48. Sort the array
public class SortArray {

    public static void main(String[] args) {


        int[] a1 = {2, 8, 32, 7, 9,976, 56};

        //int[] a2 = new int[a1.length];
        //5,4,6,2,3
        //4,5,6,2,3
        //2,5,6,4,3

        for (int i = 0; i < a1.length; i++) {
            int x = a1[i]; //5
            for (int j = i; j < a1.length; j++) {
                if (x > a1[j])//5>4 ..4>6 .. 4>2
                {
                    x = a1[j]; //x=4, x=2
                    a1[j] = a1[i]; //a1[1] =5, a1[3]=5
                    a1[i] = x; //a1[0]=4, a1[0] =2
                }

            }

        }

        for (int z : a1) {
            System.out.print(z+" ");

        }

    }
}

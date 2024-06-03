package Assignments_RKP.Arrays;

import java.sql.SQLOutput;
//47. Calculate the average of all the values present in the array
public class AverageofValuesInArray {

    public static void main(String[] args) {
        int[] a1 = {2,5,3,2,1,5,9};
        int sum =0;
        float avg;
        /*for(int i=0; i<a1.length;i++)
        {
            sum = a1[i]+sum;

        }*/
        for (int x:a1) {
            sum = x+sum;
        }
        System.out.println(sum);
        avg = (float) sum/a1.length;
        System.out.println("Average of values in array is "+avg);

    }
}

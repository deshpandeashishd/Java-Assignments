package Assignments_RKP;

public class Pattern_ABBCCC_5 {
    public static void main(String[] args) {
        // Print Pattern
        //A
        //BB
        //CCC
        //DDDD
        //EEEEE

        // Logic:
        //r1 : c1 - A - 1
        //r2 : c1,c2 - B - 2
        //r3 : c1, c2, c3 - C - 3
        //r4 : c1, c2, c3, c4 D -4
        //r5 : c1, c2, c3, c4, c5 E -5

        char s = 'A';
        for (int r =0; r<5; r++)
        {
            for (int c=0; c<=r; c++)
            {
                System.out.print((char) (s+r));
            }

            System.out.println();

        }
    }
}

package Assignments_RKP;

public class Pattern_ABC_6 {
    public static void main(String[] args) {
        // Print Pattern
        //A
        //AB
        //ABC
        //ABCD
        //ABCDE

        // Logic:
        //r1 : c1
        //r2 : c1,c2
        //r3 : c1, c2, c3
        //r4 : c1, c2, c3, c4
        //r5 : c1, c2, c3, c4, c5

        char s = 'A';
        for (int r=0; r<5; r++)
        {
            for (int c=0; c<=r; c++)
            {
                System.out.print((char) (s+c));
            }
            System.out.println();

        }
    }
}

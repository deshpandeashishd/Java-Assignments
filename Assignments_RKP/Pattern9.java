package Assignments_RKP;

public class Pattern9 {
    public static void main(String[] args) {
        // Print Pattern
        //*****
        //*   *
        //*   *
        //*   *
        //*****
        // Logic:
        //r1 : c1,c2,c3, c4, c5
        //r2 : c1, , , ,c5
        //r3 : c1, , , ,c5
        //r4 : c1, , , ,c5
        //r5 : c1, c2, c3, c4, c5


        for (int r =1; r<=5; r++)
        {
            for (int c=1; c<=5; c++)
            {
                if ((r==1) || (r==5))
                {
                    System.out.print(("*"));
                }
                else
                {
                    System.out.print(("*"+"   "+"*"));
                    break;
                }
            }
            System.out.println();
            }

        }

    }

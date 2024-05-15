package Assignments_RKP;

//22. Find the fibonacci series
public class FibonacciSeries_22 {
    /*
    Fibonacci Series - 0,1,1,2,3,5,8,13,...
    a, b, c
    c=a+b
    a =0, b=1, c=a+b=1
    next iteration
    a=b=1, b=c=1, c=1+1=2
    next iteration
    a=b=1, b=c=2, c=1+2=3 ....

     */


    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a+",");
        System.out.print(b+",");

        for (int i = 1; i<=10;i++)
        {
            c = a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }
    }

}

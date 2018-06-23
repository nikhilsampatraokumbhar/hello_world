import java.io.*;
import java.util.*;
class pos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1&&n<=100000)
        {
            System.out.print("Positive");
        }
        else
        {
            System.out.print("Negative");
        }
    }	
}

import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        for(int i=n;i>0;i--)
            m=m*i;
        System.out.print(m);
    }
}

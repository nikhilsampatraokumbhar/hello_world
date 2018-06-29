import java.util.*;
class numrev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        String s1=new StringBuffer(s).reverse().toString();
        System.out.print(s1);
    }
}

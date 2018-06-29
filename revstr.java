import java.util.*;
class revstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer s1=new StringBuffer(s);
        int n=s.length();
        if(n<=100000)
        {
            String s2=s1.reverse().toString();
            System.out.print(s1);
        }
    }
}

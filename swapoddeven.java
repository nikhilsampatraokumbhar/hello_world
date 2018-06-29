import java.util.*;
class swapoddeven 
{
    public static void main(String aa[]) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char temp;
        int n=s.length();
        char a[]=s.toCharArray();
        if(n<=10000000)
        {
        for(int i=0;i<s.length();i+=2)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(a[i]);
        }
        }
    }
}

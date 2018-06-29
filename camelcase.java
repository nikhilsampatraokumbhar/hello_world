import java.util.*;

class camelcase 
{
    public static void main(String aa[]) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            String str1=str[i];
            
            char b=Character.toUpperCase(str1.charAt(0));
            String c=str1.substring(1).toLowerCase();
            if(i==str.length-1)
            {
                System.out.print(b+c);
            }
            else
            {
                System.out.print(b+c+" ");
            }
        }
        
    }
}

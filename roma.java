import java.util.*;
class roma
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]={" ","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII",
            "XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        String s=sc.next();
        int i=0;
        for(i=0;i<a.length;i++)
        {
            String ss=a[i];
        if(s.equals(ss))
        {
            break;
        }
        }
        System.out.print(i);
        
    }
      
}

import java.util.*;
class isomorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean r=isomor(str1,str2);
        System.out.print(r);
    }
    public static boolean isomor(String s1,String s2)
    {
        int m=s1.length();
        int n=s2.length();
        Map<Character, Character> hashTable=new HashMap<Character, Character>();
        Boolean[] charExits =new Boolean[256];
        Arrays.fill(charExits,false);
        if(m!=n)
            return false;
        for(int i=0;i<m;i++)
        {
            if(charExits[s1.charAt(i)]==false)
            {
                hashTable.put(s1.charAt(i), s2.charAt(i));
                charExits[s1.charAt(i)]=true;
            }
            else if(hashTable.get(s1.charAt(i))!=s2.charAt(i))
            return false;
        }
        return true;
    }
}

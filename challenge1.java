import java.io.*;
import java.lang.*;
import java.util.*;
public class challenge1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int total=a.length()+b.length();
        System.out.println(total);
        if(a.compareTo(b)>0)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0, 1).toUpperCase()+b.substring(1));
    }
}
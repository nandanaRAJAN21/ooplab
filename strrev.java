import java.io.*;
import java.util.*;
class strrev{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String s=sc.nextLine();
String rev="";
for(int i=(s.length()-1);i>=0;i--)
{
rev+=s.charAt(i);
}
System.out.println("reversed string is "+rev);
}
}


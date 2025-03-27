import java.io.*;
import java.util.*;
class stringmanipulation{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a,b,c;
System.out.print("Enter first string:");
a=s.next();
System.out.print("Enter second string:");
b=s.next();
c=a+" "+b;
System.out.println("Length of 1st String: " + a.length());
System.out.println("Length of 2nd String: " + b.length());
System.out.println("Concatenate of  Strings: " + c);
System.out.println("Character at position 5 of "+c+":"+c.charAt(5));
System.out.println("Comparison of Strings:"+a.compareTo(b));
System.out.println("last index of 's' is :" +c.lastIndexOf('s'));
System.out.println("EndsWith Character 'r' : " + c.endsWith("r"));
System.out.println("Conversion to UpperCase: " + c.toUpperCase());
System.out.println("Conversion to LowerCase:" + c.toLowerCase());
}
}

import java.io.*;
import java.util.*;
class Stringswap{
public static void main(String[] args)
{
String a,b,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first string to swap:");
a=sc.nextLine();
System.out.println("Enter second string to swap:");
b=sc.nextLine();
temp=a;
a=b;
b=temp;

System.out.println("After swap:");
System.out.println("first string = "+a);
System.out.println("sec string = "+b);
}
}

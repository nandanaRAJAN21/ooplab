import java.io.*;
import java.util.*;
class swap{
public static void main(String[] args)
{
int a,b,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number to swap:");
a=sc.nextInt();
System.out.println("Enter second number to swap:");
b=sc.nextInt();
temp=a;
a=b;
b=temp;

System.out.println("After swap:");
System.out.println("first num = "+a);
System.out.println("sec num = "+b);
}
}

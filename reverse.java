import java.io.*;
import java.util.*;
class reverse{
public static void main(String[] args)
{
int n,rev=0,rem,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to reverse:");
n=sc.nextInt();
for(i=0;i<n;i++)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("reverse ="+rev);
}
}

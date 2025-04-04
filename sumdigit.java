import java.io.*;
import java.util.*;
class sumdigit{
public static void main(String[] args)
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
System.out.println("sum= "+sum);
}
}

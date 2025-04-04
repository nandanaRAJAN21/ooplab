import java.io.*;
import java.util.*;
class armstrong{
public static void main(String[] args)
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
int temp=n;
while(n!=0)
{
int digit=n%10;
sum=sum+digit*digit*digit;
n=n/10;
}
int num=n;
if(sum==temp)
{

System.out.println(temp+ " is an armstrong");
}
else
{
System.out.println(temp+ " is not an armstrong");
}
}
}

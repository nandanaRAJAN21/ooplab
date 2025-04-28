import java.io.*;
import java.util.*;
class NegativeNumberException extends Exception{
public NegativeNumberException(String s)
{
super(s);
}
}
class posiavg{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int count,i;
System.out.println("Please enter how much numbers to be calculated:");
count=sc.nextInt();
int[] numbers=new int[count];
try{
System.out.println("Please enter "+count+" numbers:");
for(i=0;i<count;i++)
{
int num=sc.nextInt();
numbers[i]=num;
if(num<0){
throw new NegativeNumberException("Negative numbers are not allowed");
}
}
int sum=0;
for(i=0;i<count;i++)
{
sum+=numbers[i];
}
float average=(float)sum/count;
System.out.println("Average of given numbers is: "+average);
}
catch(NegativeNumberException exc){
System.out.println("Exception caught!!");
System.out.println(exc.getMessage());
}
}
}

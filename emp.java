import java.util.*;
import java.io.*;
class employee
{
int eNo;
String eName;
double eSalary;
employee(int eNo,String eName,double eSalary)
{
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
}
class emp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
employee[] emp=new employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter eno:");
int eNo=sc.nextInt();
sc.nextLine();
System.out.println("Enter eName:");
String eName=sc.nextLine();
System.out.println("Enter eSalary:");
double eSalary=sc.nextDouble();
emp[i]=new employee(eNo,eName,eSalary);
}
System.out.println("Enter a search value:");
int s=sc.nextInt();
for(int i=0;i<n;i++)
{
if(emp[i].eNo==s)
{
System.out.println("eNo is:"+emp[i].eNo+"eName:"+emp[i].eName+"eSalary:"+emp[i].eSalary);
}
}
}
}


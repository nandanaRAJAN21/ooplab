//create a class person with data members name,gender,address,age and a constructor to initialize the data members and create another class employee that inherits the properties of class person and also contains its own data members like empid,company name,qualification,salary and its own constructors.create another class teacher that inherits the properties of class employee and contain its own data members like sub,dept,teacherid and also contain constructors and methods to display data members.use array of objects to display the details of n teachers.//
import java.io.*;
import java.util.*;
class person
{
String name;
String gender;
String address;
int age;
person(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class employee extends person{
int empId;
String company_name;
String qualification;
int salary;
employee(String name,String gender,String address,int age,int empId,String company_name,String qualification,int salary)
{
super(name,gender,address,age);
this.empId=empId;
this.company_name=company_name;
this.qualification=qualification;
this.salary=salary;
}
}
class teacher extends employee{
String subject;
String department;
int teacher_id;
teacher(int empId,String qualification,String subject,String department,int teacher_id)
{
super(empId,company_name,qualification,salary);
this.subject=subject;
this.department=department;
this.teacher_id=teacher_id;
}

void display()
{
System.out.println(empId,qualification,salary);
}
}
class pers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter n:");
n=sc.nextInt();
teacher[] te=new teacher[n];  //class name[] object=new class name(array declaration)
for( i=0; i<n;i++)
{
System.out.println("Enter"+(i+1)+"teacher details:");
System.out.println("Enter id:");
int empId=sc.nextInt();
 System.out.println("Enter qualification:");
 String qualification=sc.nextLine();
 System.out.println("Enter Salary:");
 int salary=sc.nextInt();
 te[i]=new teacher(empId,qualification,salary);
 }
 for(i=0;i<n;i++)
 {
 te[i].display();
 }
 }
 }

//Create an interface having prototypes of functions area and perimeter.create two classes circle and rectangle which implements the above interface.create a menu driven program to find area and perimeter of objects.
import java.io.*;
import java.util.*;
interface shape
{
void area();
void perimeter();
}
class circle implements shape{
int r;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("Enter the radius:");
r=sc.nextInt();
double area=Math.PI*r*r;
System.out.println("Area of Circle ="+area);
}
public void perimeter()
{
System.out.println("Enter the radius:");
r=sc.nextInt();
double peri=2*Math.PI*r;
System.out.println("Perimeter of Circle ="+peri);
}
}
class rectangle implements shape{
int l,b;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("Enter the length:");
l=sc.nextInt();
System.out.println("Enter the breadth:");
b=sc.nextInt();
double area=l*b;
System.out.println("Area of rectangle="+area);
}
public void perimeter()
{
System.out.println("Enter length:");
l=sc.nextInt();
System.out.println("Enter breadth:");
b=sc.nextInt();
double peri=2*(l+b);
System.out.println("Perimeter of rectangle="+peri);
}
}
class a{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:1.Circle,2.Rectangle");
int ch=sc.nextInt();
switch(ch)
{
case 1:
circle sh=new circle();
sh.area();
sh.perimeter();
break;
case 2:
rectangle re=new rectangle();
re.area();
re.perimeter();
break;
default:
System.out.println("Invalid Choice!!!");
}
}
}




import java.io.*;
import java.util.*;
class student{
String student_name="Laya";
}
class sport extends student{
String Sports_item="Volleyball";
}
class result extends sport{
String sports_score="Second";
int result=100;
void display()
{
System.out.println("Student Name: "+student_name);
System.out.println("Sports Name: "+Sports_item);
System.out.println("Sports Score: "+sports_score);
System.out.println("Academic Result: "+result);
}
}
class sports{
public static void main(String[] args)
{
result r=new result();
r.display();
}
}

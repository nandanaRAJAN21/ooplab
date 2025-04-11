import java.io.*;
import java.util.*;
class publisher
{
String publisher_name="Chethan Bhagat";
}
class book extends publisher
{
String bookname="Half Girlfriend";
}
class literature extends book
{
String type="literature";
}
class fiction extends book
{
String type="fiction";
}
class publish
{
public static void main(String args[])
{
literature lb=new literature();
fiction fb=new fiction();
System.out.println("Fiction book details:");
System.out.println(" Publisher: " + fb.publisher_name+ " | Book_name is: " + fb.bookname+ " | Type is: "   +fb.type);
System.out.println("Literature book details:");
System.out.println(" Publisher: " +lb.publisher_name+" | Book_name is: "+lb.bookname+" | Type is: "+lb.type);
}
}

//write a user defined exception to authenticate username and password.
import java.io.*;
import java.util.*;
class UserException extends Exception
{
public UserException(String s)
{
super(s);
}
}
class exce
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String uname,pwd;
try
{
    System.out.println("Enter Username: ");
    uname=sc.nextLine();
    
    if(uname.equals(""))

      {
        throw new UserException("Username can't be blank!!");
      }
  
   if(uname.length()<8)
   {
     throw new UserException("Username should contain 8 characters!!");
   }
}
catch(UserException e)
{
System.out.println(e.getMessage());
System.out.println("USERNAME ERROR!!");
}
try
{
    System.out.println("Enter Password: ");
    pwd=sc.nextLine();
    if(pwd.equals(""))
      {
        throw new UserException("Password can't be blank!!");
      }
  if(pwd.length()<8)
  {
    throw new UserException("Password should contain 8 characters!!");
  }
}
catch(UserException es)
{
System.out.println(es.getMessage());
System.out.println("PASSWORD ERROR!!");
}
}
}

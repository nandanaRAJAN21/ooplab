import java.io.*;
import java.net.*;
public class server
 {
  public static void main(String[] args)
 {
try
{
ServerSocket serverSocket=new ServerSocket(7011);
Socket socket=serverSocket.accept();
DataInputStream dis=new DataInputStream(socket.getInputStream());
String str=(String)dis.readUTF();
System.out.println("message="+str);
serverSocket.close();
}
catch(Exception e)
{
 System.out.println(e);
}
}
}

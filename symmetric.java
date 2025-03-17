import java.io.*;
import java.util.*;
class symmetric{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of rows:");
int r=sc.nextInt();
System.out.println("Enter the no. of columns:");
int c=sc.nextInt();
int flag=0;
int m[][]=new int [r][c];
System.out.println("Enter the elements:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=sc.nextInt();
}
}
System.out.println("The Entered matrix is:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(m[i][j]!=m[j][i])
{
flag=1;
break;
}
}
}
if(flag==0){
System.out.println("Matrix is symmetric");
}
else
{
System.out.println("Matrix is assymmetric");
}


sc.close();
}
}








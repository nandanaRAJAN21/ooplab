public class prodct{
int pcode;
String pname;
double price;
void value(int a,String b,double c){
pcode=a;
pname=b;
price=c;
}
void display(){

System.out.println(pname+","+price+","+pcode);
}
static void lowestprice(double p1,double p2,double p3)
{
if(p1<=p2 && p1<=p3)
{
System.out.println( "p1 is lowest");
}
else if(p2<=p1 && p2<=p3)
{
System.out.println( "p2 is lowest");
}
else
{
System.out.println("p3 is lowest");
}
}


public static void main(String[] args)
{
prodct ob1=new prodct();
prodct ob2=new prodct();
prodct ob3=new prodct();
ob1.value(101,"A",34.50);
ob2.value(102,"B",50.00);
ob3.value(103,"C",30.25);
ob1.display();
ob2.display();
ob3.display();
prodct.lowestprice(ob1.price,ob2.price,ob3.price);
}
}

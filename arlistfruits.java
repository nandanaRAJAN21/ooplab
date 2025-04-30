//Maintain a list of strings using array list from collection framework and perform builtin operations.
import java.io.*;
import java.util.*;
class arlistfruits{
public static void main(String[] args)
{
ArrayList<String>fruits=new ArrayList<String>();
fruits.add("Apple");
fruits.add("Avocado");
fruits.add("Orange");
fruits.add("Strawberry");
fruits.add("Banana");
fruits.add("Grapes");
fruits.add("Blueberry");
fruits.add("Pomegranate");
fruits.add(3,"Guava");
System.out.println("ORIGINAL LIST");
System.out.println("---------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
fruits.remove("Blueberry");
fruits.remove(2);
System.out.println("REMOVED LIST");
System.out.println("------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
fruits.set(3,"Chickoo");
System.out.println("UPDATED LIST");
System.out.println("------------");
for(String str:fruits)
{
System.out.println(str+" ");
}
Collections.sort(fruits);
System.out.println("SORTED LIST");
System.out.println("-----------");
for(String str:fruits)
{
System.out.println(str+" ");
}
System.out.println("Checking LIST");
System.out.println("-------------");
System.out.println("Apple is in list: "+fruits.contains("Apple"));
System.out.println("Pomegranate is in list: "+fruits.contains("Pomegranate"));
System.out.println("Size of array is "+fruits.size());
System.out.println("Object at second position is : "+fruits.get(2));
fruits.clear();
System.out.println("Final list is"+fruits);
}
}

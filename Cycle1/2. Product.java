import java.util.*;
class Product
{  
int pcode;
String pname;
float price;

void read()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the product number");
pcode=sc.nextInt();
System.out.println("Enter the product name");
pname=sc.next();
System.out.println("Enter the product price");
price=sc.nextFloat();
}

public static void main (String args[])
{

Product p1=new Product();
Product p2=new Product();
Product p3=new Product();

p1.read();
p2.read();
p3.read();

System.out.println("Products are\n");
System.out.print(p1.pcode);
System.out.print(" "+p1.pname);
System.out.println(" "+p1.price);
System.out.print(p2.pcode);
System.out.print(" "+p2.pname);
System.out.println(" "+p2.price);
System.out.print(p3.pcode);
System.out.print(" "+p3.pname);
System.out.println(" "+p3.price+"\n");


if(p1.price<p2.price && p1.price<p3.price)
{
	System.out.print("Lowest price product is:"+p1.pname);	
}
else if(p2.price<p3.price)
{
	System.out.print("Lowest price product is:"+p2.pname);		
}

else
{
	System.out.print("Lowest price product is:"+p3.pname);	
}
}
}
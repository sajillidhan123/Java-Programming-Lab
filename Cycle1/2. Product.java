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
System.out.println(p1.pcode+" "+p1.pname+" "+p1.price);
System.out.println(p2.pcode+" "+p2.pname+" "+p2.price);
System.out.print(p3.pcode+" "+p3.pname+" "+p3.price+"\n");


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

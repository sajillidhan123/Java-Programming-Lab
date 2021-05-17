import java.util.*;
class Complex
{
int a,b;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real number");
a=sc.nextInt();
System.out.println("Enter the imaginary number");
b=sc.nextInt();
}

void add(Complex x)
{
int real,img;
real=a+x.a;
img=b+x.b;
System.out.println("Sum is:"+real+"+"+img+"i");
}


public static void main(String args[])
{
Complex c1=new Complex();
Complex c2=new Complex();

c1.read();
c2.read();

System.out.println("Numbers are:"+c1.a+"+"+c1.b+"i"+" and "+c2.a+"+"+c2.b+"i");

c1.add(c2);

}
}
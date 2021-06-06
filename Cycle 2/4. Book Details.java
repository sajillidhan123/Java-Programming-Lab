import java.util.*;
abstract class Publisher
{
static int pid;
static String name;

void Publisher()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Publisher id");
pid=sc.nextInt();
System.out.println("Enter the Publisher name");
name=sc.next();
}
}

class Book extends Publisher
{
String bname;
int bid;

void Book()
{
super.Publisher();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Book id");
bid=sc.nextInt();
System.out.println("Enter the Book name");
bname=sc.next();
}
}

class Liter extends Book
{
String chap;
int chapno;

void Liter()
{
super.Book();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Chapter number");
chapno=sc.nextInt();
System.out.println("Enter the Chapter name");
chap=sc.next();

}
}

class Fiction extends Liter
{
String topic;
Fiction()
{
super.Liter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Topic");
topic=sc.next();
}
void display()
{

System.out.println("\nBook details are\n");
	System.out.print(pid);
	System.out.print("\t");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(bid);
	System.out.print("\t");
	System.out.print(bname);
	System.out.print("\t");
	System.out.print(chapno);
	System.out.print("\t");
	System.out.print(chap);
	System.out.print("\t");
	System.out.print(topic);
}
}

public class BookDetails
{

public static void main(String args[])
{
int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Fiction fn[]=new Fiction[n];
	  
	   	do
	{
		System.out.println("\nBook Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				fn[i]=new Fiction();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				fn[i].display();
				}		
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}
		
}
	




------------------------------------------------------------
  
  
  
Output


Enter the number of details to be entered
2

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
  
Enter the Publisher id: 10
Enter the Publisher name: Alex
Enter the Book id: 100
Enter the Book name: Java
Enter the Chapter number: 10
Enter the Chapter name: Polymorphism
Enter the Topic: Run time polymorphism

Enter the Publisher id: 20
Enter the Publisher name: Smith
Enter the Book id: 200
Enter the Book name: C++
Enter the Chapter number: 20
Enter the Chapter name: Inheritance
Enter the Topic: Multilevel inheritance

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Book details are

20      Smith   100     Java    10      Polymorphism    Run time polymorphism

Book details are

20      Smith   200     C++     20      Inheritance     Multilevel inheritance

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3

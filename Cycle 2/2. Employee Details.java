import java.util.*;
class Employee
{
int empid;
String name,address;
float salary;

void Employee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee id");
	empid=sc.nextInt();
	System.out.println("Enter the Employee name");
	name=sc.next();
	System.out.println("Enter the Employee address");
	address=sc.next();
	System.out.println("Enter the Employee salary");
	salary=sc.nextFloat();
}

}

class Teacher extends Employee
{
String dept,sub;

Teacher()
{
	super.Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the department");
	dept=sc.next();
	System.out.println("Enter the subject");
	sub=sc.next();
}
void display()
{
	System.out.println("\nEmployee details are\n");
	System.out.print(empid);
	System.out.print("\t");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(address);
	System.out.print("\t");
	System.out.print(salary);
	System.out.print("\t");
	System.out.print(dept);
	System.out.print("\t");
	System.out.print(sub);
	
}
}
class Main
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Teacher tr[]=new Teacher[n];
	  
	   	do
	{
		System.out.println("\nEmployee Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				tr[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				tr[i].display();
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
	



-------------------------------------------------------------------------------
  
  
Output

Enter the number of details to be entered: 3

Employee Details

Menu
1.Insert
2.Display
3.Exit

Enter your choice:1
  
Enter the Employee id: 100
Enter the Employee name: Arun
Enter the Employee address: Ernakulam
Enter the Employee salary: 50000
Enter the department: Project
Enter the subject: Java

Enter the Employee id: 101
Enter the Employee name: Rahul
Enter the Employee address: Thrissur
Enter the Employee salary: 25000
Enter the department: Developer
Enter the subject: C++
  
Enter the Employee id: 102
Enter the Employee name: Suresh
Enter the Employee address: Calicut
Enter the Employee salary: 30000
Enter the department: Tester
Enter the subject: C


Employee Details

Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Employee details are

100     Arun    Ernakulam       50000.0    Project        Java

Employee details are

101     Rahul   Thrissur        25000.0    Developer       C++

Employee details are

102     Suresh  Calicut        30000.0      Tester          C

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3

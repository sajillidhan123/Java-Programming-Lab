import java.util.Scanner;

class Employee {
	int eno,esalary;
	String ename;
	public static void main(String[] args) {
		int flag=0,size,x,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of employees to be entered");
		 size=sc.nextInt();
		Employee[] emp=new Employee[size];
		
		for(i=0;i<size;i++)
		{
			System.out.println("Enter Employee No:");
			emp[i]=new Employee();
			emp[i].eno=sc.nextInt();
			System.out.println("Enter Employee Name:");
		    emp[i].ename=sc.next();
			System.out.println("Enter Employee Salary:");
			emp[i].esalary=sc.nextInt();
		}
		System.out.println("Enter the employee no to find employee details:");
		 x=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(emp[i].eno==x)
			{
				 flag = 1;
                break;
			}
			 else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
				System.out.println("Employee No Name and Salary is: "+ emp[i].eno+" "+ emp[i].ename+" "+ emp[i].esalary);
        }
        else
        {
            System.out.println("Employee not found");
        }
    }
}
			


Output:

Enter the no of employees to be entered: 4
Enter Employee No: 1
Enter Employee Name: Alex
Enter Employee Salary: 20000
Enter Employee No: 2
Enter Employee Name: Rahul
Enter Employee Salary: 40000
Enter Employee No: 3
Enter Employee Name: Anil
Enter Employee Salary: 10000
Enter Employee No: 4
Enter Employee Name: Adam
Enter Employee Salary: 15000
	
Enter the employee no to find employee details: 3
Employee No Name and Salary is: 3 Anil 10000

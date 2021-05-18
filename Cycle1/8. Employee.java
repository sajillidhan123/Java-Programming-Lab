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
			

import java.util.*;
class Set
{
	int i;
	Scanner sc=new Scanner(System.in);
	void read(int [] ar)
	{
		System.out.print("\nEnter the elements for array:");	
		for(i=0;i<=ar.length-1;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("\nElements are");	
		for(i=0;i<=ar.length-1;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
	void search(int [] ar)
	{
		int x,flag=0;
		System.out.print("Enter the element to search: ");
		x=sc.nextInt();
		
		for(i=0;i<=ar.length-1;i++)
		{
			if(ar[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
			if(flag==1)
			{
			System.out.println("Element "+x+" found at position:"+(i+1));

			}
			else
			{
				System.out.println("Element not found");	
			}

	}
}
class Array
{
	public static void main(String args[])
	{
	int choice,size;
	Set s1=new Set();
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter the size of array:");
        size=sc.nextInt();
	int ar[]=new int[size];
	do
	{
		System.out.println("\n\nMenu\n1.Insert\n2.Search\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:s1.read(ar);
		break;
		case 2:s1.search(ar);
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}	
}



Output:

Enter the size of array:3

Menu
1.Insert
2.Search
3.Exit

Enter your choice:1

Enter the element for array:10
32
40

Elements are 10 32 40

Menu
1.Insert
2.Search
3.Exit

Enter your choice:2
Enter the element to search: 32
Element 32 found at position:2


Menu
1.Insert
2.Search
3.Exit

Enter your choice:2
Enter the element to search: 2
Element not found


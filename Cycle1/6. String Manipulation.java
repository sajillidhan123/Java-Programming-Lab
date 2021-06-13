import java.awt.*;
import java.util.*;
class manipulate {
    Scanner sc = new Scanner(System.in);
    private static String str;
    void read()
    {
        System.out.println("Enter a string:");
        str=sc.next();
    }
    void compare()
    {
        System.out.println("Enter another string to comapare:");
        String str2=sc.next();
        if(str.compareTo(str2)==0)
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are not same");
        }
    }
    void concat()
    {
        System.out.println("Enter another stirng to concatinate:");
        String str2=sc.next();
        String str3=str+" "+str2;
        System.out.println(str3);
    }
    void length()
    {
        System.out.println("Length of "+str+" is:"+str.length());
    }
    void upper_lower()
    {
        System.out.println("Upper case:"+str.toUpperCase());
        System.out.println("Lower case:"+str.toLowerCase());
    }
    void reverse()
    {
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reverse of "+str+" is:"+sb.reverse());
    }
    
}
public class Strings {
    public static void main(String args[]) {
		int choice;
        manipulate m = new manipulate();
        Scanner sc = new Scanner(System.in);
        m.read();
        do {
            System.out.println("1.Length\n2.Compare\n3.Concatinate\n4.Upper case & Lower case\n5.Reverse\n6.Exit");
			System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    m.length();
                    break;
                case 2:
                    m.compare();
                    break;
                case 3:
                    m.concat();
                    break;
                case 4:
                    m.upper_lower();
                    break;
                case 5:
                    m.reverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while (choice != 6) ;
    }

}

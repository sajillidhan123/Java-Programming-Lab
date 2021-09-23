import java.io.*;
import java.util.*;

public class ReadFile {
  public static void main(String[] args) throws Exception {
     int i=0;

     FileInputStream fin = new FileInputStream("File.txt");
     FileOutputStream feven = new FileOutputStream("Even.txt");
     FileOutputStream fodd = new FileOutputStream("Odd.txt");
    
     while((i=fin.read())!=-1) 
     {
      if(i%2==0)
      {
      feven.write(i);
     }
      else
      fodd.write(i);
     }
    
     fin.close();
     feven.close();
     fodd.close();

      }

    } 

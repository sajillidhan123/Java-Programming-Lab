import java.util.Arrays;
public class Sort 
{    
   private static String[] strs = {"Audi", "Mercedes", "Ferrari", "Nissan", "Toyota", "Bmw", "Bentley", "Aston Martin", "Porsche"};
    
    public enum sort_asc_dsc{
       ASC, DESC
   }
    
       public static void main(String[] args) {
       System.out.println("\nOriginal unsorted order: " + Arrays.toString(strs));
       sort_array_by_length(strs, sort_asc_dsc.ASC);
	   System.out.println("\nSorted order (ascending order): " + Arrays.toString(strs)); 
	   sort_array_by_length(strs, sort_asc_dsc.DESC);
       System.out.println("\nSorted order (descending order): " + Arrays.toString(strs));
                 
   }
   public static void sort_array_by_length(String[] strs, sort_asc_dsc direction) {
       if (strs == null || direction == null || strs.length == 0) {
           return;
       }
       if (direction.equals(sort_asc_dsc.ASC)) {
           Arrays.sort(strs, (String str1, String str2)
                   -> Integer.compare(str1.length(), str2.length()));
       } else if (direction.equals(sort_asc_dsc.DESC)) {
           Arrays.sort(strs, (String str1, String str2)
                   -> (-1) * Integer.compare(str1.length(), str2.length()));
       }
   }
}

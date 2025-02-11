package java_pat;
import java.util.Scanner;
public class Q8Star_pattern {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        System.out.println("How many rows you want in this pattern?");
	 
	        int rows = sc.nextInt();
	 
	        for (int i = 1; i <= rows; i++)
	        {

	            for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            }

	            for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j);
	            } 
	 
	            System.out.println();
	        } 

	        for (int i = rows-1; i >= 1; i--)
	        {
 
	            for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            }
 
	            for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j);
	            }
	 
	            System.out.println();
	        }
	 
	        //Closing the resources
	 
	        sc.close();
	}

}

package java_pat;
import java.util.Scanner;

public class Q2Star_pattern {

	public static void main(String[] args) {
		
			        Scanner sc = new Scanner(System.in);
			 
			        //Taking rows value from the user
			 
			        System.out.println("How many rows you want in this pattern?");
			 
			        int rows = sc.nextInt();

			        for (int i = rows; i >= 1; i--)
			        {
			            for (int j = 1; j <= i; j++)
			            {
			                System.out.print(j+" ");
			            }
			 
			            System.out.println();
			        }
			 
			        //Close the resources
			 
			        sc.close();
			    }
	}


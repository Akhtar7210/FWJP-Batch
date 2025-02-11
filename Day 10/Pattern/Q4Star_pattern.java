package java_pat;

import java.util.Scanner;

public class Q4Star_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--)
        {
            //Printing spaces at the beginning of each row
 
            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }
 
            //Printing 1 to i value at the end of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        //Closing the resources
 
        sc.close();

	}

}

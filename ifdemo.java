import java.util.Scanner;
public class ifdemo{
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter a number :- ");
		int n=sc.nextInt();
	
	if(n>0)
	{
	System.out.println("Positive Number");
	}
	else if (n<0)
	{
	System.out.println("Negarive Number");
	}
	else
	{
	System.out.println("Zero is provided");	
	}
    }
}

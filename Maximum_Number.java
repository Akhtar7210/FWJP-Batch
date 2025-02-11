import java.util.Scanner;
class Maximum_Number
{
	public static void main(Strin[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number1 :- ");
		int num1 = input.nextInt();
		System.out.print("Enter the number2 :- ");
		int num2 = input.nextInt();
	if(num1>num2)
		System.out.print("Maximum Number is "+num1);
	else if(num1<num2)
		System.out.print("Maximum Number is "+num2);
	else
		System.out.print("Both are Equal "+num1);
	
	}
}
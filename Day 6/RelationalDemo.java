import java.util.Scanner;

class RelationalDemo
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("Enter two value :");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("A is greater than B :"+(a>b));
System.out.println("A is greater than equals to B :"+(a>=b));
System.out.println("A is less than B :"+(a<b));
System.out.println("A is less than equals to B :"+(a>b));
System.out.println("A is equals to B :"+(a==b));
System.out.println("A is not equals to B :"+(a!=b));


}




}
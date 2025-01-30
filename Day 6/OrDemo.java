import java.util.Scanner;

class OrDemo
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Character :");
	char ch = sc.next().charAt(0);


boolean lower = ch >=97 && ch>=122;
System.out.println(ch+" is in lower case :"+lower);
boolean upper = ch >=65 && ch>=90;
System.out.println(ch+" is in upper case :"+upper);


boolean result = lower || upper;
System.out.println(ch+"is an Alphabet or not :"+result);
System.out.println(ch+"is not Alphabet :"+!result);

}

}
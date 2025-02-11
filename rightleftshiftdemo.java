public class rightleftshiftdemo{

 public static void main(String[] args){
	
	int a=100;
	int bits=1;
	
	System.out.println("Original Number :- "+a);
	System.out.println("New Number after right shift :- "+(a>>bits));
	System.out.println("New Number after left shift :- "+(a<<bits));

}
}
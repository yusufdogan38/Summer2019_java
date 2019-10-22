package day32_JavaReveiw;

public class OverLoadMethodReveiw {
	/*
	 overload methods: improves the reusability
	 				improves readability
	 				flexible during runtime
	 				
	 		same method names, different parameters
	 		
	 		return type of the overload does not matter
	 
	 */
	
	public static void main(String[] args) {
		
		sum(10.5, 20.7);
		sum(30 , 40, 50 );
		
		sum(10 ,  10 ,  10 < 20 );
		
		int total =  sum(10, 10.5, 10 );
		
	}
	
	public static void sum (int a, int b) {
		System.out.println("int sum is: " + (a+b) );
	}
	
	public static void sum ( double a, double b ) {
		System.out.println("double sum is: " + (a+b) );
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println("int sum is: " + (a+b+c) );
	}
	
	public static void sum (double a, long b, boolean c) {
		System.out.println("You have entered "+ a + " " + b + " " + c );
	}
	
	
	public static int sum(int a, double b, int c) {
		int sum = a + (short)b +c;
		return  sum;
	}
	
	
	
	

}

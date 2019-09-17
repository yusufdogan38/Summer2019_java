package day22_NestedLoop;
import java.util.Scanner;
public class NestedLoopTask2 {
	
	public static void main(String[] args) {
		
		
		while(true) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Do you wanna continue?");
		scan.nextLine();
		 String answer =scan.nextLine();
		  while( !(answer.contentEquals("yes")) || answer.contentEquals("no")) {
			 
			  System.out.println("Please make up your mind");
				System.out.println("Do you wanna continue?");
			  answer= scan.nextLine();
			  
			  
			  
			  if(answer.contentEquals("no")) {
			break;
		}
		}	
		
	}
	
	/*  
	calculator program:
	write a program that asks user if he/she wants to: *, / , %, -,+
	then ask user to enter two numbers
	then return the result to the console
	and 
	
	
	
	 */
	
	
	}
	
	
}
	
	



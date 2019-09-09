package assignment;

public class NumberSwitch {
 public static void main(String[] args) {
	
	 
	 int a = 10;
	 int b = 15;
	  System.out.println("=== BEFORE SWITCH ===");
	  System.out.println("A:" + a); // expected is 10
	  System.out.println("B:" + b); // expected is 15
	  
	  // swap those two variables value without using a temporary variable 
	  
	  
	  a = a + b; // a = 25
      b = a - b; // b = 10 (a)
      a = a - b; // a = 15
      
      System.out.println("===  AFTER SWITCH ===");
      System.out.println("A:" + a); // expected is 15
      System.out.println("B:" + b); // expected is 10
    		  
    		  
			  
      
	 
}
}

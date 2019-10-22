package day32_JavaReveiw;

public class CustomMethodsReveiw {
	/*
	 decleration of methods:
	 		
	 		Access-modifiers  specifier  return-type  methodName(parameter ){
	 					 
	 					 method body
	 		
	 		}
	 
	 	Access modifier: public
	 	specifier: static
	 	return-type: void, all pimitives and non primitives
	 	methodName: anyName
	 	parameter: all data type
	 
	 
	 
	 if the return type is void: method does not return any value
	 
	 if the return type is NOT void: the method MUST return a value, 
	 						and the returning value MUST match with return type
	 
	 methods that passes parameter (with argument): method requires extra informations to perform it's task
	 
	 
	 */
	
	public static void main(String[] args) {
		
		method1();
	//	method1();
	//	method1();
		
		oneTo100Even();
		
		ReverseStr("ABCDE");
		//			argument
		
		byte num =	(byte)largestNumber(12 , 13);  // 13
		System.out.println(num);
		
		
		System.out.println(  largestNumber(10, 20)  );
		
		
	//	int numz = method1();  // not a return method
		
		
		String Hazim = Reverse("Hazim");
		
		System.out.println(Hazim);
		
		
		
	}	
	
	
	public static void method1() {
		System.out.println("Hello WOrld");
		System.out.println("Hello cybertek");
		System.out.println("Hello Batch12");
	}
	
	
	public static void oneTo100Even() {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 ==1) {
				continue;
			}
			System.out.print(i +" ");	
		}
		System.out.println();
		
	}
	
	
	
	public static void  ReverseStr(String str) {
		
		for(int i = str.length()-1; i >= 0; i-- ) {
			System.out.print( str.charAt(i) );
		}
		
		System.out.println();
		
	}
	
	
	public static void print(String str) {
		System.out.println(str);
		
		return;
	//	System.out.println("Completed");
		
	}
	
	
	public static int largestNumber (int a, int b) {
		
			int max =0;
			
			if(a >b)
				max = a;
			else 
				max = b;		
			
			return  max;
		//	System.out.println(max);
			
	}
	
	
	public static String Reverse( String  str	) {
		
		String result="";
		
		for(int i = str.length()-1; i >= 0;  i-- ) {
		//	 result += str.substring(i, i+1);
				result += ""+str.charAt(i);
		}
		
		return result;
	}
	
	
	
	

}
	
	
	


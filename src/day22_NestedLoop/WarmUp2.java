package day22_NestedLoop;

public class WarmUp2 {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		String original = "abcdefg";
		String Reserve ="";
		
		 for(int i=0; i< original.length(); i++) { 
		 
			 
			 Reserve +=original.substring (i, i+1);
			 
			 
			 
			 
		 }
		boolean result = original.contentEquals(Reserve) ? true : false ;
		System.out.println(Reserve);
		
		
		
		
		 
	}
}

package day21_whileLoops;

public class warmUp {
	
	    /*
	     1. write a java program that can count how many time 
	        the word "book" is appeared in a String
	        Ex:
	        input: I like books, I have books, I need book
	        output: 3
	     */
	    
	    public static void main(String[] args) {
	        
	String sentence ="I like book, I have book, I need book, I buy book";
	        // index:        z
	    int count = 0;
	    for(int z= 0; z < sentence.length() - 3 ; z++) {
	        if(sentence.substring(z, z+4 ).equals("book") ) {
	                //            0, 4
	                //            1, 5
	                 //           2, 6
	            //               ...
	            //                16,  20  ==> 16, 19
	            
	            count++;
	        }
	        
	    }
	    
	    System.out.println(count);
	        
	    /*
	     1. write a java program that can count how many time 
	        the word "book" is appeared in a String
	        Ex:
	        input: I like books, I have books, I need book
	        output: 3
	     */
	    
	
	        
	String sentence1 ="book book book book book";
	        // index:        z
	    int count1 = 0;
	    for(int z= 0; z < sentence1.length() - 3 ; z++) {
	        if(sentence.substring(z, z+4 ).equals("book") ) {
	                //            0, 4
	                //            1, 5
	                 //           2, 6
	            //               ...
	            //                16,  20  ==> 16, 19
	            
	            count++;
	        }
	        
	    }
	    
	    System.out.println(count);
	        
	        
	    
	    
	String words ="Cybertek is school, Cybertek is great, I love Cybertek";
	//  index:      i,  i+7
	// substring (i, i+7+1)    ending index is excluded in substring
	    int nTimes = 0;
	    for(int i = 0; i < words.length()-7; i++) {
	        //                  
	        if(words.substring(i  ,  i+8 ).equals("Cybertek")) {
	            //                   i+7
	            nTimes++;
	        }
	        
	    }
	    
	    System.out.println(nTimes);
	    
	    
	    /*
	     write a java program that can remove duplicated values from String
	        EX:
	            input: aabbcc
	            output: abc
	     */
	    
	        String s1 = "aabbcc";
	        //           i
	        //  a:  (0, 1)  
	    //          (i, 1+1)
	        String result = "";  //abc  // to store the new String value that does not have duplicates
	        
	        for(int i=0; i < s1.length(); i++) {
	            if(! result.contains( s1.substring(i, i+1) )) {
	                //                          (5, 6) ==> c
	                result += s1.substring(i, i+1);
	            }
	        }
	        System.out.println(result);
	        String s2 = "aabbcc";
	        //           i
	        //  a:  (0, 1)  
	    //          (i, 1+1)
	        String result2 = "";  //abc  // to store the new String value that does not have duplicates
	        
	        for(int i=0; i < s1.length(); i++) {
	            if(! result.contains( ""+s1.charAt(i) )) {
	                            //     s1.substring(i, i+1 )  
	                //                          (5, 6) ==> c
	                result += s1.substring(i, i+1);
	            }
	        }
	        System.out.println(result);   
	        
	    }
	   
	        
	        
	        
	    }



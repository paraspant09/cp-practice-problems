/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Scanner ob=new Scanner(System.in);
    	    
    	    String str1=ob.next();
    	    int numTestCases=ob.nextInt();
    	    
    		Set<Character> S1=new HashSet<Character>();
    		Set<Character> S2=new HashSet<Character>();
    	    int i=0;
    		while(i!=str1.length()){
    		  S1.add(str1.charAt(i));
    	      i++;
    		}
    	    
    		while( numTestCases > 0 ){
    		
    		    String str2=ob.next();
    		    
    		    i=0;
    		    while(i!=str2.length()){
    		        S2.add(str2.charAt(i));
    		        i++;
    		    }
    		    
    		    System.out.println(S1.containsAll(S2)?"Yes":"No");
    		    S2.clear();
                numTestCases--;
    		}
		}catch(Exception e){
			return;
		}
	}
}

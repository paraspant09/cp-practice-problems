/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Xoragn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases > 0 ){
    		    int lengthOfArray=ob.nextInt();
    		    
    		    int[] A=new int[lengthOfArray];
    		    
    		    for (int i=0; i<lengthOfArray ;i++ ){
    		        A[i]=ob.nextInt();
    		    }
    		    
    		    int xor=0;
    		    for (int i=0; i<lengthOfArray ;i++ ){
    		        xor^=(A[i]+A[i]);
    		    }
    		    
    		    System.out.println(xor);
                numTestCases--;
    		}
		}catch(Exception e){
			return;
		}
	}
}

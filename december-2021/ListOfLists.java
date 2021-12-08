/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ListOfLists
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases-- > 0 ){
    		    int lengthOfArray=ob.nextInt();
    		    
    		    int[] Array=new int[lengthOfArray];
    		    
    		    for (int i=0; i<lengthOfArray ;i++ ){
    		        Array[i]=ob.nextInt();
    		    } 
    		    
    		    int maxCount=0;
    		    int[] Counter=new int[lengthOfArray+1];
    		    
    		    for (int i=1; i<=lengthOfArray ;i++ ){
    		        Counter[Array[i-1]]+=1;
    		    }
    		    
    		    for (int i=1; i<=lengthOfArray ;i++ ){
        		    if(Counter[i]>maxCount){
        		        maxCount=Counter[i];
        		    }
    		    }
    		    
    		    if(maxCount==lengthOfArray)
    		        System.out.println(0);
    		    else if(maxCount==1)
    		        System.out.println(-1);
    		    else
    		        System.out.println(lengthOfArray-maxCount+1);
    		}
		}catch(Exception e){
			return;
		}
	}
}

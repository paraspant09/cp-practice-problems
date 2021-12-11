/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ValleysNHills
{
	public static void findString(int H,int V){
		StringBuilder str=new StringBuilder();
		
		if(H==V)	str.append("01");

		if(H>V){
			while (H != V) {
				str.append("010");
				H--;
			}
			while (H > 0) {
				str.append("10");
				H--;
			}
		}
		else if(V>=H){
			while (H != V) {
				str.append("101");
				V--;
			}
			while (V > 0) {
				str.append("01");
				V--;
			}
		}

		System.out.println(str.length());
		System.out.println(str.toString());
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases > 0 ){
    		    int noOfHills=ob.nextInt();
				int noOfValleys=ob.nextInt();
    		    
    		    findString(noOfHills,noOfValleys);
				numTestCases--;
    		}
		}catch(Exception e){
			return;
		}
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class InterestingSubsequences
{
    public static Long nCr(int n,int r){
        Long[][] A=new Long[n+1][r+1];
        int k=0;
        for (int i=0; i<=n ;i++ ){
            A[i][0]=1L;
            if(k<=r){
                A[0][k]=1L;
                A[i][k]=1L;
                k++;
            }
        }

        for (int i=1; i<=n ;i++ ){
            for (int j=1; j<=r && j<=i ;j++ ){
                if(i!=j)
                    A[i][j]=A[i-1][j-1]+A[i-1][j];
            }
    	}
        
        return A[n][r];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases > 0 ){
    		    int N=ob.nextInt();
    		    int k=ob.nextInt();
    		    
    		    int[] A=new int[N];
    		    
    		    for (int i=0; i<N ;i++ ){
    		        A[i]=ob.nextInt();
    		    }
    		    
    		    Arrays.sort(A);
    		    
    		    int t=k,r=0,n=0;
    		    int max=A[k-1];
    		    while(t>0 && A[t-1]==max){
    		        r++;
    		        t--;
    		    }
    		    while(t<A.length && A[t]==max){
    		        n++;
    	            t++;
    	        }
		        System.out.println(nCr(n,r));
                
                numTestCases--;
    		}
		}catch(Exception e){
			return;
		}
	}
}

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Balance_0s_N_1s
{
    public static String Balancer(int len,String str){
        int zeroes=0,ones=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='0')  ++zeroes;
            else if(ch=='1')  ++ones;

        }
        
        StringBuilder newStr=new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='?') {
                if(zeroes>ones){
                    ch='1';
                    ones++;
                }
                else{
                    ch='0';
                    zeroes++;
                }
            }
            newStr.append(ch);

        }

        return newStr.toString();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases-- > 0 ){
    		    int lengthOfString=ob.nextInt();
    		    
    		    String str=ob.next();
    		    
    		    System.out.println(Balancer(lengthOfString,str));
    		}
		}catch(Exception e){
			return;
		}
	    
	}
}

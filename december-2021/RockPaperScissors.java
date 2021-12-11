/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RockPaperScissors
{
    private static String Game(String list,int len) {
        StringBuilder sb=new StringBuilder();
        if(len==1 || list.matches("(?i)RS|PR|SP|RR|PP|SS"))
            return list;
        if(len==2){
            if(list.equals("RP"))
                return "PP";
            if(list.equals("PS"))
                return "SS";
            if(list.equals("SR"))
                return "RR";
        }

        for (int i = len-1; i > 0; i--) {
            char gestureOne=list.charAt(i-1);
            char gestureTwo=list.charAt(i);
            String r= "" + gestureOne + gestureTwo ;
            if (r.matches("(?i)RR|PP|SS"))
                sb.append(gestureTwo);
            else if(r.matches("(?i)RP|PS|SR")){
                while (i>=0) {
                    sb.append(gestureTwo);
                    i--;
                }
                break;
            }
            else {      //if(RS|PR|SP")
                sb.append(""+gestureTwo+gestureOne);
                i=i-2;
                String checkS="",checkR="",checkSR="",checkPS="",checkRPS="",checkPSR="";
                
                while (i>=0) {
                    char curGesture=list.charAt(i);
                    
                    if(checkS=="" && (curGesture!=gestureOne && curGesture!=gestureTwo)){  //cur=S
                        checkS=""+gestureTwo;
                        checkSR="";
                    }
                    if(checkR=="" && curGesture==gestureTwo){  //cur=R
                        checkR=""+gestureOne;
                        checkRPS="";
                    }
                    if(checkSR=="" && checkR!="" && (curGesture!=gestureOne && curGesture!=gestureTwo)){    //cur=S
                        checkSR=""+gestureOne;
                        checkS="";
                    }
                    if(checkPS=="" && checkS!="" && curGesture==gestureOne){   //cur=P
                        checkPS=""+gestureTwo;
                        checkPSR="";
                    }
                    if(checkRPS=="" && checkPS!="" && curGesture==gestureTwo){     //cur=R
                        checkRPS=""+gestureTwo;
                        checkR="";
                    }
                    if(checkPSR=="" && checkSR!="" && curGesture==gestureOne){     //cur=P
                        checkPSR=""+gestureOne;
                        checkPS="";
                    }


                    if(curGesture!=gestureOne && curGesture!=gestureTwo){   //S
                        if(checkRPS!="")
                            sb.append(gestureTwo);
                        else if(checkR!="")
                            sb.append(gestureOne);
                        else
                            sb.append(gestureTwo);
                    }
                    else if(curGesture==gestureOne){    //P
                        if(checkSR!="")
                            sb.append(gestureOne);
                        else if(checkS!="")
                            sb.append(gestureTwo);
                        else
                            sb.append(gestureOne);
                    }
                    else {      //R
                        if(checkPSR!="")
                            sb.append(gestureOne);
                        else if(checkPS!="")
                            sb.append(gestureTwo);
                        else
                            sb.append(gestureOne);
                    }
                    i--;
                }
                break;
            }
           if(i==1) sb.append(gestureTwo);
        }
        
        return sb.reverse().toString();
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Scanner ob=new Scanner(System.in);
    	    
    	    int numTestCases=ob.nextInt();
    	    
    		while( numTestCases > 0 ){
    		    int lengthOfString=ob.nextInt();
    		    
    		    String str=ob.next();
    		    
    		    System.out.println(Game(str,lengthOfString));
                numTestCases--;
    		}
		}catch(Exception e){
			return;
		}
	}
}

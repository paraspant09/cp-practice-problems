/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckMate
{
    public static double Abs(int num){
        return Math.abs(num);
    }

    public static String CheckForMate(int k_x,int k_y,
            int r1_x,int r1_y,
            int r2_x,int r2_y
        ){

        if( (k_y == 1) && (r1_x!=r2_x) && (r1_y == 2 || r2_y == 2) && 
             Abs(r1_x-k_x)>1 && Abs(r2_x-k_x)>1 )
             return "yes";

        if( (k_y == 8) && (r1_x!=r2_x) && (r1_y == 7 || r2_y == 7) && 
             Abs(r1_x-k_x)>1 && Abs(r2_x-k_x)>1 )
             return "yes";

        if( (k_x == 1) && (r1_y!=r2_y) && (r1_x == 2 || r2_x == 2) && 
             Abs(r1_y-k_y)>1 && Abs(r2_y-k_y)>1 )
             return "yes";

        if( (k_x == 8) && (r1_y!=r2_y) && (r1_x == 7 || r2_x == 7) && 
             Abs(r1_y-k_y)>1 && Abs(r2_y-k_y)>1 )
             return "yes";
        
        return "no";
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        PrintWriter out=new PrintWriter(System.out);;
		try{
			InputStreamReader r=new InputStreamReader(System.in);    
            BufferedReader br=new BufferedReader(r);
    	    
    	    String numTestCases=br.readLine();
            int T=Integer.parseInt(numTestCases);
    	    
    		while( T-- > 0 ){

                String kingPos=br.readLine();
                String[] kingPosStr = kingPos.split(" ", 2);

                int king_x=Integer.parseInt(kingPosStr[0]);
                int king_y=Integer.parseInt(kingPosStr[1]);

                String rookOnePos=br.readLine();
                String[] rookOnePosStr = rookOnePos.split(" ", 2);

                int rook1_x=Integer.parseInt(rookOnePosStr[0]);
                int rook1_y=Integer.parseInt(rookOnePosStr[1]);

                String rookTwoPos=br.readLine();
                String[] rookTwoPosStr = rookTwoPos.split(" ", 2);

                int rook2_x=Integer.parseInt(rookTwoPosStr[0]);
                int rook2_y=Integer.parseInt(rookTwoPosStr[1]);
    		    
    		    out.println(
                    CheckForMate(
                        king_x,king_y,
                        rook1_x,rook1_y,
                        rook2_x,rook2_y
                    )
                );
    		}
		}catch(Exception e){
			return;
		}finally{
            out.close();
        }
	}
}

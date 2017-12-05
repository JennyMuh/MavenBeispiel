package de.jenny;
import java.io.*;


/**
 * @brief the app class
 * @author jenny
 *
 */
public class App 
{
	/**
	 * 
	 * @param args
	 */
    public static void main( String[] args )
    {
    	 try {
    		   String thisLine = null;
    	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	       while ((thisLine = br.readLine()) != null) 
    	       {
    	         System.out.println(thisLine.toUpperCase());
    	       } // end while 
    	     } // end try
    	     catch (IOException e) {
    	       System.err.println("Error: " + e);
    	     }
    /*	 try{
    		 String thisInput = null;
    		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		 while ((thisInput = br.readLine()) != null) 
  	       {
  	         System.out.println(thisInput.istErstesHalbjahr());
  	       }
    	 } 
    	 catch(IOException e)
    	 {
    		 System.err.println("Error: "+e);
    	 }*/
        System.out.println( "Hello World!" );
    }
}

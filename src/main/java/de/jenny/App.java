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
    	       } 
    	     } 
    	     catch (IOException e) {
    	       System.err.println("Error: " + e);
    	     }
        System.out.println( "Hello World!" );
    }
}

package de.jenny;
import java.io.*;

public class App 
{
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
        System.out.println( "Hello World!" );
    }
}

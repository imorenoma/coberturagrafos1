package urjc.isi.Thermostat;

import java.io.*;

public class Thermostat 
{
	public static String pOD;
	public static String tmp;
	
    public static void advance() {
    	
    	if (pOD == "Sleep") {
    		
    		pOD = "Wake";
    		
    	}else {pOD = "Sleep";}
    }
    
    public static void up() {
    	
    	if (tmp == "Low") 
    		
    		tmp = "High";
    		
    }
    
    public static void down() {
    	
    	if (tmp == "High") 
    		
    		tmp = "Low";   		
    	
    }
}


package graph;

import java.io.*;

public class GFS {
	static void pattern(int line) { 
        int i, j; 
        for(i = 0; i<line; i++) { 
            for(j = 0; j<line; j++) { 
                if((j==1 && i!=0 && i!=line-1) || 
                ((i==0 || i==line-1) && j>1 && 
                j<line-2) || (i==((line-1)/2) &&  
                j>2 && j<line-1) || (j == line-2 &&  
                i!=0 && i>=((line-1)/2) && i!=line-1)) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
      
            } 
            System.out.println(); 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args) { 
        int line=7; 
        pattern(line); 
    } 
}

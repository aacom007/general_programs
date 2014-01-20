/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spiraltraversal;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import java.io.IOException;

/**
 *
 * @author akshay anand
 * Email-id - akshayan@usc.edu
 * Dated - 05-01-2014
 */

public class SpiralTraversal {

    /**
     * @param args the command line arguments
     */
    
    public static int [][] output= new int[5][5];
    static int N=0;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int  row=0,col=0,count =0,i=0,j=0;
      try
      {
        System.out.println("Enter the dimension of matrix 'N' - rotation will be clockwise");
        
        count=5;
        N=5;
        Integer.parseInt(System.console().readLine());

        spiralFunction(count) ;
   
        for(i=0;i<count;i++){
            for(j=0;j<count;j++){ 
                System.out.print(output[i][j]+" \t");
            }System.out.println();
            }
            
        
      }
      catch(Exception e ){
       System.out.println(e);
      }
    }
    
    
    public static void spiralFunction(int count){
    int  val=0,i=0,j=0, counter=0;
    
         val = (int)(count / 2.0 ;
       
      for ( i = 0; i < val; i++) {
      // looping through row forward
             for (j = 0; j < count; j++) {
                // System.out.print("test1");
                output[i][i + j] = counter++;
               // System.out.print("test2");
             }
 
      // looping through col downward
             for (j = 1; j < count; j++) {
              output[i + j][N - 1 - i] = counter++;
             }
 
      // looping through row backward
              for (j = count - 2; j > -1; j--) {
                output[N - 1 - i][i + j] = counter++;
              }
 
      // looping through col upward
           for (j = count - 2; j > 0; j--) {
              output[i + j][i] = counter++;
             }
 
       count -= 2;
    }
 
    }
            
    
    
}

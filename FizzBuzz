/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fizzbuzz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author akshay anand
 * Email-id - akshayan@usc.edu
 * Dated - 05-01-2014
 */
public class FizzBuzz {

    static int N=0;
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           int  row=0,col=0,count =0,i=0,j=0;
      try
      {
        System.out.println("Enter the number N");
    
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp=  br.readLine();
        N=Integer.parseInt(tmp);
       
        for( i=1;i<=N;i++)
        printthechar(i);
      
      }
      catch(Exception e){
      
          System.out.print(e);
      }
    }
    
    public static void printthechar(int i){
    
        if(i%15==0)
        {
            System.out.println("fizzbuzz");
            return;
        }
         if(i%5==0)
        {
            System.out.println("buzz");
            return;
        }
         if(i%3==0)
        {
            System.out.println("fizz");
            return;
        }
         else
            
        {
            System.out.println(i);
            return;
        }
        
    }
    
}

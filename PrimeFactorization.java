/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactorization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author akshay anand
 * Email-id - akshayan@usc.edu
 * Dated - 05-01-2014
 */
public class PrimeFactorization {

    /**
     * @param args the command line arguments
     * This function is used to find all the prime factors of a given input number
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=42;
        try{
           //taking input from the user
           System.out.print("Enter the number whose prime factors you want (integer only)");
         
           //reading from the console.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String tmp=  br.readLine();
            try{
                //taking the input as a string from the console and convert it
                N=Integer.parseInt(tmp);
                   functiontest(N);
            }
            catch(TypeNotPresentException e){
                System.out.print(e);
            }
      
        }
         catch(Exception e){
              System.out.print(e);
         }
    }
    public static void functiontest(int N){
      for (int i=2;i<=N;i++){
               if(iIsPrime(i)){
                   //Checking if the number is exactly divisible with each other or not.
                   if(((double)N/i)==(Math.round((double)(N/i)))){
                       {    //adding the number to the ArrayList
                            //nos.add(i);
                             System.out.print(i+" ");
                            N/=i;
                            functiontest(N);
                            break;
                       }
                   }              
               } 
           }
    
    
    }
    
    //function returns true if the number is prime or not
    public static boolean iIsPrime(int a)
    {
        for(int i=2;i<=(int) Math.sqrt(a);i++)
        {
           
            if(a%i==0)
            return false;
        }
        return true;
    }
}

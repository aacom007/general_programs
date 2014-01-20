
/**
 *
 * @author akshay anand
 * Email-id - akshayan@usc.edu
 * Dated - 05-01-2014
 */

package lookandsay1;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream ;
import java.io.InputStreamReader;
import java.math.BigInteger;

public  class LookandSay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Reads the input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp=  br.readLine();
        StringBuilder result= new StringBuilder();
       
        int num1, count =1, num = 0, strlength=0;
        char a, next;

        try{
            if(tmp.length() == 0 ){             
                result.append(tmp);
            }
            if(tmp.length() == 1 ) {
                result.append("1" +"x"+tmp);
            }
            else {
                a= tmp.charAt(0);  
                // next =tmp.charAt(1);
                while (strlength<(tmp.length()-1)) {
                next =tmp.charAt(strlength+1);
                if(next!= a) {
                        result.append(count+ ""+ (char)a );
                        count =1;
                        a= next;
                    }
                    else
                    {
                        count++;
                        
                    }
                strlength++;
               
            }
                 result.append(count+""+ (char)a);
        System.out.println("the resulting string is ="+result.toString());
        }
        }
        catch(Exception e){
              System.out.print(e);
        }       
 }
    
    
  
    
}


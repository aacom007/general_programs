/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uniquepartition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author akshay anand
 * created on : 19 January 2014.
 * USC Los Angeles
 */
public class UniquePartition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // 
        System.out.print("Enter the number:\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        
        int num= Integer.parseInt(tmp);
        if(num==0){
            System.err.println("Cannot partition number is zero\n");
        }
        else if(num <0)
            System.err.println("negative number\n");
        else
            partition(num);
    }
    static public void partition(int a){
        int num=0 ,temp=a;
        while(num!=1)
        {
            num=a;
            
            for(int i= 1;i<a;i++){
                num = num-i;
                System.out.print(a+" "+i+"-"+ num);
                 System.out.println("");     
                partition(num);
                
            }
        }
    }
}

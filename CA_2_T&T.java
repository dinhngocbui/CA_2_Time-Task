package homework3;

import java.util.Scanner;


public class Homework3 {
    static void ThiagosMethod(){
        /**
         * Author: Thiago
         */

         String username = "";
         Scanner myKB = new Scanner(System.in);
        
         System.out.println("Please, enter your name");

         try{
             username = myKB.nextLine();
         }

         catch(Exception e){
             System.out.println("Error");
         }

         char result = username.chatAT(0);
         if(result == 't' || result == 'T'){
             System.out.println("Join Thiago`s club");
         }

         else{
             System.out.println("No entry");
         }

    }

    static void MilasMethod(){
        
        System.out.println("This is Mila's method");
        Scanner name = new Scanner (System.in);
    
        String UserName = "";
        System.out.println("Please, enter your name");
    
        try{
        UserName = name.nextLine();
         }
        
         catch (Exception e){
         System.out.println ("C");
         }
        
         char result = UserName.charAt(0);
         if (result == 'm'|| result == 'M'){
         System.out.println("Join Mila's club");
         }
         else {
         System.out.println("No entry =(");
         } 
         }

            /**
            *
            * @author Charles Franklin Jahn
            */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myKB = new Scanner(System.in);
        System.out.println("What is your name?"); 
        String name = myKB.nextLine().trim();
        String firstL = name.substring(0,1);
        
        if (firstL.matches("[Cc]+")){
            System.out.println("WELCOME to Charles Club!!!");
        }

        //use here to put your piece of code

        ThiagosMethod();



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplytwonumbers;
import java.util.Scanner;
/**
 *
 * @author Dinh Ngoc Bui
 */
public class Multiplytwonumbers {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args)
    {
        Scanner sc = null;
        sc =new Scanner(System.in);
        System.out.println("enter the 1st no");
        int no1=sc.nextInt();
       System.out.println("enter the 2nd no");
        int no2=sc.nextInt();
        // logic
        int sum= 0;
        sum= no1*no2;
        System.out.println("Result is ="+sum);
       // Dinh Ngoc Bui Method 
              
        
    }
    
}

    
    
    






    }
    
}

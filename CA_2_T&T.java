package homework3;

import java.util.Scanner;

/**
 *
 * @author Charles Franklin Jahn
 * @author
 * @author
 * @author
 * @author
 */
public class Homework3 {

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









    }
    
}

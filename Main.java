/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azzam
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int num1 = (int) (Math.random()*10);
      int num2 = (int) (Math.random()*10);
     
      if (num1<num2)
      { 
     int num3 = num1 ;
     num1=num2;
     num2=num3;
      } 
        System.out.println(num1 +"-" + num2);
         int result = num1 - num2;
         int answer = in.nextInt();
         if (answer==result) System.out.println("Correct");
         else {System.out.println("Wrong answer! The correct answer is " + result); }
       
        
       
        
    }
    
}

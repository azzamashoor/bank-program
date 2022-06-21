/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1_xa_1938002;

/**
 *
 * @author azzam
 */
 
import java.util.Scanner;
public class A1_XA_1938002 {
/*Azzam Ashoor , 1938002 , CPCS-202-XA , Assignment #1 , aashour0024@stu.kau.edu.sa 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--------- Welcome to Bank Al-Badr ---------");
        System.out.println("Please enter your current balance(in SAR):");
        int B = in.nextInt();
        System.out.println("Please enter the amount to withdraw (in SAR):");
        int W = in.nextInt();
        double S1 = W * 0.0245;
        double S2 = W * 0.0305;
        int fivehundred, onehundred, fifty, ten, five, one, note, W2;
        double r1 = B - W - S1 ; 
        double r2 = B - W - S2 ;
        fivehundred = W / 500;
        W2 = W % 500;
        onehundred = W2 / 100;
        W2 = W2 % 100;
        fifty = W2 / 50;
        W2 = W2 % 50;
        ten = W2 / 10;
        W2 = W2 % 10;
        five = W2 / 5;
        one = W2 % 5;
        note = fivehundred + onehundred + fifty + ten + five + one;

        int fivehundred2 = 500 * fivehundred;
        int onehundred2 = 100 * onehundred;
        int fifty2 = 50 * fifty;
        int ten2 = 10 * ten;
        int five2 = 5 * five;
        int one2 = 1 * one;

        if (W > 5000) {
            System.out.println("Sorry, amount exceeds maximum daily limit!");
        } else if (note > 20) {
            System.out.println("Sorry, cannot dispense amount!");
        } else if (W <= 2500) {
            if (W + S1 <= B) {
                System.out.printf("Transaction successful. Your new balance is %.2f " , (B - W - S1) ,"SAR");
                System.out.println("\n--------------------------------------------------"
                          + "\nDetails of notes dispensed"
                          + "\n                 500 x "+fivehundred +" = "+fivehundred2 
                          + "\n                 100 x "+onehundred +" = "+onehundred2 + "\n                  50 x "+fifty+" = "+fifty2
                          + "\n                  10 x "+ten +" = "+ten2 +               "\n                   5 x "+five+" = "+five2 
                          + "\n                   1 x "+one +" = "+one2 +               "\n                           ____"
                          + "\nTotal amount (in SAR)      "+W);  
            } else {
                System.out.println("Sorry, insufficient funds!");
            }
        } else if (W + S2 <= B) {
            
            System.out.printf("Transaction successful. Your new balance is %.2f" ,(B - W - S2) , "SAR");
            System.out.println("\n--------------------------------------------------"
                          + "\nDetails of notes dispensed"
                          + "\n                 500 x "+fivehundred +" = "+fivehundred2 
                          + "\n                 100 x "+onehundred +" = "+onehundred2 + "\n                  50 x "+fifty+" = "+fifty2
                          + "\n                  10 x "+ten +" = "+ten2 +               "\n                   5 x "+five+" = "+five2 
                          + "\n                   1 x "+one +" = "+one2 +               "\n                           ____"
                          + "\nTotal amount (in SAR)      "+W);
        } else {
            System.out.println("Sorry, insufficient funds!");
        }
     
       
            
        
        
        
        
        
       
        
         
               
    
    
}

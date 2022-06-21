/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devidingmoney;

/**
 *
 * @author azzam
 */
import java.util.Scanner;
public class DevidingMoney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of money");
      double money = in.nextDouble();
      money = money *100;
      int dollars = (int) money / 100 ;
        System.out.println("Dollars : " + dollars);
        money = money % 100 ; 
        double quarters =(int) money / 25; 
        System.out.println("Quarters :" + quarters);
        money = money % 25 ;
        double dimes = (int) money / 10;
        System.out.println("Dimes :" + dimes);
        money = money % 10 ; 
        double nickels = (int) money / 5 ; 
        System.out.println("Nickels : " + nickels);
        money = money % 5 ; 
        System.out.println("Pennies :" + money);
        
        
      
      
      
      
      
      
      
      
    }
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliza brok
 */
public class bintang2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                
                if(i==1||i==5||j==1||i==2||i==6||j==2){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println(" ");
        
        }
        System.out.println("________________________");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                
                if(j==1||j==8||i==5||j==2||j==9||i==6){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println(" ");
        
        }
    }
    
}

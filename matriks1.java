/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliza brok
 */
public class matriks1 {
    public static void main(String[] args) {
        int a [][] = {{1,2,3,4},{2,3,4,1},{1,3,2,4}};
        int b [][] = {{5,6},{7,8},{9,2},{3,7}};
        int h [][] = {{0,0},{0,0},{0,0}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            } 
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(h[i][j]+"\t");
            }
            System.out.println(" ");  
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliza brok
 */
public class matriks2 {
    public static void main(String[] args) {
        int a[][]= {{1,2,3},{3,2,1},{2,3,1},{3,1,2}};
        int b [][]= {{4,5,6},{5,4,6},{6,5,4},{4,6,5}};
        int c [][]= {{7,8,9},{9,8,7},{7,9,8},{9,7,8}};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(a[i][j]+b[i][j]-c[i][j]+"\t");
                
            }
            System.out.println(" ");
            
        }
    }
    
}

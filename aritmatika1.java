
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliza brok
 */
public class aritmatika1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Masukkan nilai pertama : ");
        a = sc.nextInt();
        System.out.print("Masukkan Selisih : ");
        b = sc.nextInt();
        System.out.print("Masukkan Jumlah Deret : ");
        c = sc.nextInt();
        
        int u=a;
        int s=a;
        for (int i = 0; i < c; i++) {
            if (u%2==0) 
                System.out.print(u + " ");
            u=u+b;
            s=s+u;
        } 
        System.out.println();
    }
}

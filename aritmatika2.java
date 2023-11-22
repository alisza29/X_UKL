
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliza brok
 */
public class aritmatika2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("suku-1 : ");
        a = sc.nextInt();
        System.out.print("selisih : ");
        b = sc.nextInt();
        System.out.print("deret : ");
        c = sc.nextInt();
        
        int u=a,s=a,d=a,f=a;
        
        System.out.println("Hasil : ");
        for (int i = 0; i < c; i++) {
            System.out.print(u+"\t");
            u=u+b;
            s=s+u;
        }
        System.out.println();
        System.out.println("bil ganjil + 5 :");
        for (int i = 0; i < c; i++) {
             if (d%2==1) 
            System.out.print(d+5+"\t");
            d=d+b;
            f=f+u;
        }  
        System.out.println();
    }
}

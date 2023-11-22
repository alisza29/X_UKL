/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_SEM_2;

import java.util.ArrayList;

/**
 *
 * @author aliza brok
 */
public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry(){
        
        this.jenisLaundry.add("Cuci Ekspres");
        this.harga.add(10000);
        this.durasi.add(8);
        
        this.jenisLaundry.add("Cuci Standard");
        this.harga.add(6000);
        this.durasi.add(4);
        
        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(5000);
        this.durasi.add(8);
    }
    
    public int getJmlJL(){
        return this.jenisLaundry.size();
    }
    
    public void setJenisLaundry(String JenisLaundry){
        this.jenisLaundry.add(JenisLaundry);
    }
    
    public String getJenisLaundry(int idJenisLaundry){
        return this.jenisLaundry.get(idJenisLaundry);
    }
    
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    
    public int getDurasi(int idJenisLaundry){
        return this.durasi.get(idJenisLaundry);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idJenisLaundry){
        return this.harga.get(idJenisLaundry);
    }
    
}
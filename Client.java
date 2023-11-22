/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_SEM_2;

import java.util.ArrayList;

public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telpon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("Mia");
        this.alamat.add("Suhat");
        this.telpon.add("089032145672");
        this.saldo.add(250000);

        this.namaClient.add("Rere");
        this.alamat.add("Lawang");
        this.telpon.add("081234567891");
        this.saldo.add(250000);
        
        this.namaClient.add("Nanda");
        this.alamat.add("Klojen");
        this.telpon.add("081234567891");
        this.saldo.add(250000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

    public int getJmlClient() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telpon.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telpon.get(idClient);
    }

}
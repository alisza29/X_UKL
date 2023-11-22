/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_SEM_2;

/**
 *
 * @author aliza brok
 */
public class LaundryStore {

    public static void main(String[] args) {

        Client client = new Client();
        Petugas petugas = new Petugas();
        Laporan laporan = new Laporan();
        Transaksi transaksi = new Transaksi();
        JenisLaundry jenisLaundry = new JenisLaundry();

        laporan.laporan(jenisLaundry);
        transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
        laporan.laporan(transaksi, jenisLaundry);
        laporan.laporan(petugas);
        laporan.laporan(client);
    }
}

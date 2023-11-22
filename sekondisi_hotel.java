/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uklhotel;

import java.util.Scanner;

/**
 *
 * @author aliza brok
 */
public class sekondisi_hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lokasi,hotel,jenis;
        int harga,jumlah;
        
        System.out.println("=== Booking hotelss ===");
        System.out.print("Kota : ");
        lokasi=sc.nextLine();
        System.out.print("Hotel : ");
        hotel=sc.nextLine();
        System.out.print("Jenis : ");
        jenis=sc.nextLine();
        System.out.print("Jumlah orang : ");
        jumlah=sc.nextInt();
        System.out.println("");
        
        switch (lokasi) {
            case "yogyakarta" :
                if (hotel.equalsIgnoreCase("Sahid")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Yogyakarta" );
                    System.out.println("Nama   : Sahid");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*388000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*673000;
                        System.out.println("harga : Rp. " + harga);
                    }
                    else {System.out.println("tipe kamar tidak tersedia");}
                } else {System.out.println("mohon maaf, hotel tidak tersedia");}
                if (hotel.equalsIgnoreCase("Lafayette")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Yogyakarta");
                    System.out.println("Nama   : Lafayette");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*894000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*1340000;
                        System.out.println("harga : Rp. " + harga);
                    }
                    else {System.out.println("tipe kamar tidak tersedia");}
                } 
                if (hotel.equalsIgnoreCase("New Saphir")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Yogyakarta" );
                    System.out.println("Nama   : New Saphir");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*1000000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*1345000;
                        System.out.println("harga : Rp. " + harga);
                    }
                    else {System.out.println("tipe kamar tidak tersedia");}
                }break;
            case "bali" : 
                if (hotel.equalsIgnoreCase("Ibis")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Bali ");
                    System.out.println("Nama   : Ibis");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*400000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*764000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }else {System.out.println("mohon maaf, hotel tidak tersedia");}
                if (hotel.equalsIgnoreCase("Golden Tulip")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Bali ");
                    System.out.println("Nama   : Golden Tulip ");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*330000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*459000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }
                if (hotel.equalsIgnoreCase("Holiday Inn")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Bali ");
                    System.out.println("Nama   : Holiday Inn");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*1200000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*1876000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }break;
            case "surabaya" : 
                if (hotel.equalsIgnoreCase("bess mansion")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Surabaya");
                    System.out.println("Nama   : Bess Mansion");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*468000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*528000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }else {System.out.println("mohon maaf, hotel tidak tersedia");}
                if (hotel.equalsIgnoreCase("royal tulip")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Surabaya");
                    System.out.println("Nama   : Royal Tulip");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*780000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*1000000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }
                if (hotel.equalsIgnoreCase("aston")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Surabaya");
                    System.out.println("Nama   : Aston");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*336000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*407000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }break;
            case "malang" : 
                if (hotel.equalsIgnoreCase("aria")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Malang");
                    System.out.println("Nama   : Aria");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*567000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*972000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }else {System.out.println("mohon maaf, hotel tidak tersedia");}
                if (hotel.equalsIgnoreCase("atria")){
                    System.out.println("=== BILL HOTEL ===");
                    System.out.println("Lokasi : Malang");
                    System.out.println("Nama   : Atria");
                    System.out.println("Tipe Kamar   : " + jenis);
                    System.out.println("Jumlah orang : " + jumlah);
                    if (jenis.equalsIgnoreCase("superior")){
                        harga=jumlah*624000;
                        System.out.println("Harga : Rp. " + harga);
                    }
                    else if (jenis.equalsIgnoreCase("deluxe")){
                        harga=jumlah*874000;
                        System.out.println("Harga : Rp " + harga);
                    }
                    else {System.out.println("tipe kamar tidak dikenali");}
                }break;
                
        }
        
    }
    
}

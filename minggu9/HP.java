/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author D2J-00
 */
public class HP implements Phone {
    private int volume;
    private int baterai;
    private int pulsa;
    public String name;
    public String number;
    
    public HP(){
        this.volume = 47;
        this.baterai = 78;
        this.pulsa = 8790;
    }
    
    
    @Override
    public void powerOn() {
        System.out.println("Hadphone ON");
    }
    
    @Override
    public void powerOff() {
        System.out.println("Hadphone OFF");
    }
    
    @Override
    public void volumeUp() {
        this.volume ++;
        System.out.println("Volume sekarang: " + this.getVolume());
    }
    
    @Override
    public void volumeDown() {
        this.volume --;
        System.out.println("Volume sekarang: " + this.getVolume());
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public void contact(){
        
        Scanner scanner = new Scanner(System.in);
        Map<String, String> kontak = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cari Kontak");
            System.out.println("3. Tampil Kontak");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu (1-4): ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline setelah membaca angka

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String nomor = scanner.nextLine();
                    tambahKontak(kontak, nama, nomor);
                    System.out.println("Kontak berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan nama kontak yang akan dicari: ");
                    String cariNama = scanner.nextLine();
                    String cariNomor = cariKontak(kontak, cariNama);
                    if (cariNomor != null) {
                        System.out.println("Nomor telepon " + cariNama + ": " + cariNomor);
                    } else {
                        System.out.println("Kontak tidak ditemukan.");
                    }
                    break;
                case 3:
                    tampilKontak(kontak);
                    break;
                    
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
            System.out.println();
        }
    }
    
        public static void tambahKontak (Map<String, String> kontak, String nama, String nomor) {
        kontak.put(nama, nomor);
    }

    public static String cariKontak(Map<String, String> kontak, String nama) {
        return kontak.get(nama);
    }
    
    public static void tampilKontak(Map<String, String> kontak) {
        if (kontak.isEmpty()) {
            System.out.println("Tidak ada kontak yang tersimpan.");
        } else {
            System.out.println("Daftar Kontak:");
            for (Map.Entry<String, String> entry : kontak.entrySet()) {
                String nama = entry.getKey();
                String nomor = entry.getValue();
                System.out.println(nama + ": " + nomor);
            }
        }
    }
        
    @Override
    public void pulsa() {
        System.out.println("Pulsa sekarang: " + this.getPulsa());
    };
    
    @Override
    public void topupPulsa() {
        this.pulsa ++;
        System.out.println("Pulsa sekarang: " + this.getPulsa());
    };
    
    public int getPulsa() {
        return this.pulsa;
    }
    
    @Override
    public void baterai(){
        System.out.println("Baterai sekarang: " + this.getBaterai());
    };
    
    @Override
    public void chargeBaterai(){
        this.baterai ++;
        System.out.println("Baterai sekarang: " + this.getBaterai());
    };
    
    public int getBaterai() {
        return this.baterai;
    }
    
}

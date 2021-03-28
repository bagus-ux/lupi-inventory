package com.daftarbarang;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int pilihan, pilbarang;
        Scanner input = new Scanner(System.in);
        //
        Barang barang1 = new Barang();
        barang1.setDetailBarang(1, "Sepatu Nike", "1500k");
        Barang barang2 = new Barang();
        barang2.setDetailBarang(2, "Kaos Deus", "500k");
        Smartphone smartphone1 = new Smartphone();
        smartphone1.setDetailBarang(3, "Iphone X", "18000k", "IOS", 8, 128);
        Kamera kamera1 = new Kamera();
        kamera1.setDetailBarang(4, "Cannon EOS 1300D", "5000k", "Wide And Micro");
        //ArrayList
        ArrayList<String> barang = new ArrayList<String>();
        barang.add("Sepatu Nike");
        barang.add("Kaos Deus");
        barang.add("IphoneX");
        barang.add("Kamera Cannon DSLR");
        //
        Pemilik owner = new Pemilik();
        owner.setNama("Shinigami Junior");
        owner.setUmur(25);
        Penjelasantoko pt = new Penjelasantoko();
        System.out.println("================================");
        System.out.println("SELAMAT DATANG DI DEATH STORE");
        System.out.println("================================");
        System.out.println(" 1. Info Toko");
        System.out.println(" 2. List Barang");
        pt.penjelasan();
        pt.keterangan();
        System.out.println("================================");
        System.out.println("MASUKAN PILIHAN ANDA : ");
        System.out.println("================================");
        pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("==Toko ini didirikan oleh Shinigami The Death pada tahun 1890");
            System.out.println("==di Death Valley namun kini telah diwariskan ke " + owner.getNama());
            System.out.println("==" + owner.getNama() + "kini berumur " + owner.getUmur());
            System.out.println("==Dia menjadi pewaris termuda yang pernah ada ");
        } else if (pilihan == 2) {
            System.out.println("========== LIST BARANG ==========");
            System.out.println(" 1. " + barang.get(0));
            System.out.println(" 2. " + barang.get(1));
            System.out.println(" 3. " + barang.get(2));
            System.out.println(" 4. " + barang.get(3));
            System.out.println("=================================");
            System.out.println("MASUKAN PILIHAN ANDA : ");
            System.out.println("=================================");
            pilbarang = input.nextInt();
            if (pilbarang == 1) {
                barang1.TampilkanDetailbarang();
            } else if (pilbarang == 2) {
                barang2.TampilkanDetailbarang();
            } else if (pilihan == 4) {
                smartphone1.TampilkanDetailbarang();
            } else if (pilihan == 5) {
                kamera1.TampilkanDetailbarang();
            } else {
                System.out.println("MOHON MASUKAN PILIHAN SESUAI DENGAN PILIHAN YANG TERSEDIA");
            }
        }else {
            System.out.println("MOHON MASUKAN PILIHAN SESUAI DENGAN PILIHAN YANG TERSEDIA");
        }
    }
}

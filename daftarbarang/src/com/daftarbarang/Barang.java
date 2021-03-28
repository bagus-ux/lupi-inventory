package com.daftarbarang;

public class Barang {
    int id;
    String nama, harga;
//constructor
    Barang(){
        System.out.println("================================");
    }
    //methods
    void setDetailBarang(int id ,String nama, String harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    void TampilkanDetailbarang(){
        System.out.println("ID BARANG\t\t = " +id);
        System.out.println("NAMA BARANG\t\t = " +nama);
        System.out.println("HARGA BARANG\t = " +harga);
    }
}
class Smartphone extends Barang {
    String os;
    int ram, storage;
    //overloading
    void setDetailBarang(int id, String nama, String harga, String os, int ram, int storage) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
    }
    //overriding
    void TampilkanDetailbarang() {
        System.out.println("ID BARANG\t\t\t = " + id);
        System.out.println("NAMA BARANG\t\t\t = " + nama);
        System.out.println("HARGA BARANG\t\t = " + harga);
        System.out.println("OPERATION SYSTEM\t = " + os);
        System.out.println("RAM\t\t\t\t\t = " + ram);
        System.out.println("STORAGE\t\t\t\t = " + storage);
    }
}
class Kamera extends Barang {
    String lensa;
    //overloading
    void setDetailBarang(int id, String nama, String harga, String lensa) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.lensa = lensa;
    }
    //overriding
    void TampilkanDetailbarang() {
        System.out.println("ID BARANG\t\t = " + id);
        System.out.println("NAMA BARANG\t\t = " + nama);
        System.out.println("HARGA BARANG\t = " + harga);
        System.out.println("LENSA\t\t\t = " + lensa);
    }
}


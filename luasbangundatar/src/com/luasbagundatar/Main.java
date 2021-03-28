package com.luasbagundatar;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	int pilihan;
		Scanner scan = new Scanner(System.in);
		lingkaran Mylingkaran = new lingkaran();
		persegi_panjang Mypersegipanjang = new persegi_panjang();
		persegi Mypersegi = new persegi();
		segitiga Mysegitiga = new segitiga();

		ArrayList<String> namabangun = new ArrayList<String>(); //ArrayList
		namabangun.add("Lingkaran");
		namabangun.add("Persegi Panjang");
		namabangun.add("Persegi");
		namabangun.add("Segitiga");
		//
		sambutan sambut = new sambutan();
		sambut.setSambutan("================Selamat Datang===============\n");
		sambut.show();
		System.out.println("==Menghitung Keliling dan Luas Bangun Datar==\n");
		System.out.println(" 1. " +namabangun.get(0) +"\n");
		System.out.println(" 2. " +namabangun.get(1) +"\n");
		System.out.println(" 3. " +namabangun.get(2) +"\n");
		System.out.println(" 3. " +namabangun.get(3) +"\n");
		System.out.println("=============================================\n");
		System.out.println("Masukan Pilihan Anda : ");
		pilihan = scan.nextInt();
		if(pilihan==1){
			Mylingkaran.setjari();
			Mylingkaran.setPhi(3.14);
			Mylingkaran.tampilkan_lingkaran();
		}else if(pilihan==2){
			Mypersegipanjang.setPanjang();
			Mypersegipanjang.setLebar();
			Mypersegipanjang.tampilkan_persegipanjang();
		}else if(pilihan==3){
			Mypersegi.setSisi();
			Mypersegi.tampilkan_persegi();
		}else if(pilihan==4) {
			Mysegitiga.setAlas();
			Mysegitiga.setTinggi();
			Mysegitiga.setSisia();
			Mysegitiga.setSisib();
			Mysegitiga.tampilkan_segitiga();
		}else{
			System.out.println("Masukan Pilihan Yang Sudah Tersedia!");
		}
    }
}

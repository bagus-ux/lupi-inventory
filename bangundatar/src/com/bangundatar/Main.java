package com.bangundatar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int pilihan;
        int a,b,c,d;
        Scanner input = new Scanner(System.in);
        System.out.println("=====Selamat Datang======");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("=========================");
        System.out.println("Masukan Pilihan Anda : ");
        pilihan = input.nextInt();
        if (pilihan==1){
            System.out.println("======Masukan Data =======");
            System.out.println("Masukan Sisi :  ");
            a = input.nextInt();
            Persegi persegi1 =new Persegi(a);
            persegi1.show_info();
            persegi1.show_sudut();
        }
        else if (pilihan==2){
            System.out.println("======Masukan Data =======");
            System.out.println("Masukan Panjang :  ");
            a = input.nextInt();
            System.out.println("Masukan Lebar :  ");
            b = input.nextInt();
            persegi_panjang pp1 =new persegi_panjang(a, b);
            pp1.show_info();
            pp1.show_sudut();
        }
        else if (pilihan==3){
            System.out.println("======Masukan Data =======");
            System.out.println("Masukan Alas :  ");
            a = input.nextInt();
            System.out.println("Masukan Tinggi :  ");
            b = input.nextInt();
            System.out.println("Masukan Sisi A :  ");
            c = input.nextInt();
            System.out.println("Masukan Sisi B :  ");
            d = input.nextInt();
            segitiga segitiga1 =new segitiga(a, b, c, d);
            segitiga1.show_info();
            segitiga1.show_sudut();
        }
        else if (pilihan==4){
            System.out.println("======Masukan Data =======");
            System.out.println("Masukan Jari - Jari :  ");
            a = input.nextInt();
            lingkaran lingkaran1 =new lingkaran(a);
            lingkaran1.show_info();
            lingkaran1.show_sudut();
        }
        else {
            System.out.println("Masukan Pilihan Sesuai Dengan Pilihan Diatas");
        }
    }
}

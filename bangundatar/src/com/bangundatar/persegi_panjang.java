package com.bangundatar;

public class persegi_panjang extends info implements luas_keliling{
    int panjang, lebar;
    public persegi_panjang(int a, int b){
        panjang=a;
        lebar=b;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
    @Override
    public double keliling() {
        return 2 * (panjang + lebar) ;
    }
    public void show_sudut() {
        System.out.println("Jumlah Sudut Persegi Panjang Adalah 4 Dengan Total 360 Derajat ");
    }
    public void show_info(){
        System.out.println(" Luas  :  " +luas());
        System.out.println(" Keliling  :  " +keliling());
    }
}

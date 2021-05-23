package com.bangundatar;

public class lingkaran extends info implements luas_keliling{
    int jari;
    final double PHI = 3.14;

    public lingkaran(int a){
        jari=a;
    }

    @Override
    public double luas() {
        return jari * jari * PHI;
    }
    @Override
    public double keliling() {
        return PHI * 2 * jari;
    }
    public void show_sudut() {
        System.out.println("Lingkaran Tidak Memiliki Sudut ");
    }
    public void show_info(){
        System.out.println(" Luas  :  " +luas());
        System.out.println(" Keliling  :  " +keliling());
    }
}

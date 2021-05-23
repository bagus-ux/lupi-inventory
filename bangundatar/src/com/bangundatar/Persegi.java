package com.bangundatar;

public class Persegi extends info implements luas_keliling{
    public int sisi;
    public Persegi(int a){
        sisi=a;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
    @Override
    public double keliling() {
        return 4 * sisi;
    }
    public void show_sudut() {
        System.out.println("Jumlah Sudut Persegi Adalah 4 Dengan Total 360 Derajat ");
    }
    public void show_info(){
        System.out.println(" Luas  :  " +luas());
        System.out.println(" Keliling  :  " +keliling());
    }
}

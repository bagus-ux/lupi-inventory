package com.daftarbarang;

//abstraction
abstract class Penjelasan {
    public void penjelasan(){
        System.out.println("================================");
        System.out.println("SEMUA BISA DIBELI DI DEATH STORE");
    }
    public abstract void keterangan();
}
class Penjelasantoko extends Penjelasan{
    public void keterangan(){
        System.out.println("Jalan Death Valley No. 666");
    }
}

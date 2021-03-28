package com.daftarbarang;
//enkapsulasi
public class Pemilik {
    private String nama;
    private int umur;
    //setter
    public void setNama(String newName){
        nama = newName;
    }
    //getter
    public String getNama(){
        return nama;
    }
    //setter
    public void setUmur(int newUmur){
        umur = newUmur;
    }
    //getter
    public int getUmur(){
        return umur;
    }
}

package com.company.inheritance;

public class Pegawai {
    int jenis;
    String nama;
    int gol;
    int tahun;

    public void isi (int jns, String nama, int gol, int th) {
        this.jenis = jns;
        this.nama = nama;
        this.gol = gol;
        this.tahun = th;
    }

    int hitungGajiPokok(){
        int gapok;
        if (this.gol == 1 || this.gol ==2){
            gapok = 1000000;
        } else if (this.gol == 3){
            gapok = 2000000;
        }else {
            gapok = 3000000;
        }
        return gapok;
    }

    public void printPegawai(){
        System.out.println("\n Nama Pegawai : " + this.nama);
        System.out.println(" Golongan     : " + this.gol);
        System.out.println(" Gaji Pokok   : Rp " + this.hitungGajiPokok());
    }
}
package com.company.inheritance;

public class Dosen extends Pegawai {

    int hitungTunjangan(){
        int tunjangan;
        if (this.tahun >=0 && this.tahun <=5){
            tunjangan = 500000 * this.tahun;
        }else {
            tunjangan = 700000 * this.tahun;
        }
        return tunjangan;

    }

    int hitungTjFungsional(){
        int tjFungsional;
        if (this.tahun < 10){
            tjFungsional = 1700000;
        } else {
            tjFungsional = 2000000;
        }
        return tjFungsional;
    }

    int hitungTotalGaji(){
        int total;
        total = this.hitungGajiPokok() + this.hitungTunjangan() + this.hitungTjFungsional();
        return total;
    }

    public void printPegawai(String rincian){
        System.out.println(" " + rincian);
        System.out.println(" Nama Pegawai           : " + this.nama);
        System.out.println(" Golongan               : " + this.gol);
        System.out.println(" Gaji Pokok             : Rp " + this.hitungGajiPokok());
        System.out.println(" Tunjangan Pegawai      : Rp " + this.hitungTunjangan());
        System.out.println(" Tunjunjangan Fungsinal : Rp " + this.hitungTjFungsional());
        System.out.println(" Total Gaji             : Rp " + this.hitungTotalGaji());
    }
}

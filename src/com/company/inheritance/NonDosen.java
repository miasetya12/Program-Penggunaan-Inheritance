package com.company.inheritance;

public class NonDosen extends Pegawai  {

    int hitungTunjangan(){
        int tunjangan;
        if (this.tahun >=0 && this.tahun <=5){
            tunjangan = 450000 * this.tahun;
        }else {
            tunjangan = 600000 * this.tahun;
        }
        return tunjangan;
    }

    int hitungTotalGaji(){
        int total;
        total = this.hitungGajiPokok() + this.hitungTunjangan();
        return total;
    }

    public void printPegawai(String rincian){
        System.out.println(" " + rincian);
        System.out.println(" Nama Pegawai           : " + this.nama);
        System.out.println(" Golongan               : " + this.gol);
        System.out.println(" Gaji Pokok             : Rp " + this.hitungGajiPokok());
        System.out.println(" Tunjangan Pegawai      : Rp " + this.hitungTunjangan());
        System.out.println(" Total Gaji             : Rp " + this.hitungTotalGaji());
    }
}


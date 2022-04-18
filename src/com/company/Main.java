package com.company;
import java.util.Scanner;

import com.company.inheritance.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n===========================================================");
        System.out.print("\n==               PERHITUNGAN GAJI PEGAWAI                ==");
        System.out.print("\n===========================================================");
        System.out.print("\n Masukan Jenis Pegawai (1=Dosen / 2=Non Dosen): ");
        int jenis = input.nextInt();

        if (jenis == 1) {
            System.out.print(" Masukan Nama: ");
            String nama = input.next();
            System.out.print(" Masukan Golongan: ");
            int gol = input.nextInt();
            System.out.print(" Masukan Lama Waktu Mengabdi (tahun): ");
            int th = input.nextInt();
            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Ketik 1, jika ingin mengetahui gaji pokok ");
            System.out.print("\n Ketik 2, jika ingin mengetahui total gaji keseluruhan");
            System.out.print("\n Masukan Pilihan: ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            Dosen p2 = new Dosen();
            p2.isi(jenis, nama, gol, th);
            if (pilihan==1){
                p2.printPegawai();
            }else if (pilihan==2){
                p2.printPegawai("\n Berikut Rinciannya Gaji Dosen");
            }else {
                System.out.print("\n Pilihan salah, Anda keluar dari sistem");
                System.out.print("\n Silakan mengulang menginputkan data");
                Main.menu();
            }

        } else if (jenis == 2) {
            System.out.print(" Masukan Nama: ");
            String nama = input.next();
            System.out.print(" Masukan Golongan: ");
            int gol = input.nextInt();
            System.out.print(" Masukan Lama Waktu Mengabdi (tahun): ");
            int th = input.nextInt();

            System.out.print("\n--------------------------------------------------------");
            System.out.print("\n Ketik 1, jika ingin mengetahui gaji pokok ");
            System.out.print("\n Ketik 2, jika ingin mengetahui total gaji keseluruhan");
            System.out.print("\n Masukan Pilihan: ");
            int pilihan = input.nextInt();
            System.out.print("\n--------------------------------------------------------");

            NonDosen p1 = new NonDosen();
            p1.isi(jenis, nama, gol, th);
            if (pilihan==1){
                p1.printPegawai();
            }else if (pilihan==2){
                p1.printPegawai("\n Berikut Rinciannya Gaji Non Dosen");
            }else {
                System.out.print("\n Pilihan salah, Anda keluar dari sistem");
                System.out.print("\n Silakan mengulang menginputkan data");
                Main.menu();
            }

        } else {
            Main.menu();
        }

        System.out.print("\n--------------------------------------------------------");
        System.out.print("\n Ketik 1, untuk mengulang program ");
        System.out.print("\n Ketik 0, untuk keluar program");
        System.out.print("\n Masukan Pilihan: ");
        int pil = input.nextInt();

        if (pil==1){
            Main.menu();
        }else {
           System.exit(0);
        }
    }
}



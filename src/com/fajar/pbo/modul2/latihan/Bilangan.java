package com.fajar.pbo.modul2.latihan;

import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c, test;

        System.out.print("Masukkan Jumlah  case : " );
        test = scan.nextInt();

        for (int i = 1; i <= test; i++) {
            System.out.print("Masukan Nilai A"+i+" : ");
            a = scan.nextInt();
            System.out.print("Masukan Nilai B"+i+" : ");
            b = scan.nextInt();
            System.out.print("Masukan Nilai C"+i+" : ");
            c = scan.nextInt();

            System.out.println("Hasil dari  A+B-C Adalah : "+(a+b-c));
        }


    }
}

package com.fajar.pbo.modul2.latihan;

public class AnakAyam {
    public static void main(String[] args) {

        int anak = 10, total;

        for (total = anak; total > 1; total--){
            System.out.print("Anak Ayam Turun " + anak+ "\n");
            anak=total-1;
            System.out.println("Mati 1 Tinggal " + anak);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}

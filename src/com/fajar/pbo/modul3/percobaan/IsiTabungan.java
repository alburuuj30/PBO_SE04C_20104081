package com.fajar.pbo.modul3.percobaan;

public class IsiTabungan {
    public static void main(String[] args) {
        //construct objek 't' dari class 'Tabungan' dengan nilai saldo awal sebesar 5000
        Tabungan t = new Tabungan(5000);

        //output nilai saldo
        System.out.println("Saldo awal tabungan Anda: " + t.saldo);

        //panggil method AmbilUang()
        t.AmbilUang(5000);

        //Output
        System.out.println("Jumlah uang yang d ambil : 1500");

        //Output
        System.out.println("Saldo Tabungan anda sekarang adalah: " + t.saldo);
    }
}

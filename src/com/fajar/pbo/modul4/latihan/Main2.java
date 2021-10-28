package com.fajar.pbo.modul4.latihan;

public class Main2 {
    public static void main(String[] args) {
        Tabungan1 saya = new Tabungan1("Barca",50410420,1000000,12345);
        System.out.println("Nama\t\t : " + saya.getNama());
        System.out.println("noRekening\t : " + saya.getnoRekening());
        System.out.println("saldo\t\t : " + saya.getSaldo());
        System.out.println("pin\t\t : " + saya.getPin());
    }
}

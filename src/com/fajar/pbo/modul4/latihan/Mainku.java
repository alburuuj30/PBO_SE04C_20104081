package com.fajar.pbo.modul4.latihan;

public class Mainku {
    public static void main(String[] args) {
        Tabunganku aku = new Tabunganku("pertama", 20000);
        Tabunganku kamu = new Tabunganku("Fajar", 213123, 300601);

        aku.setSaldo(2_000_000);
        aku.setPIN(300601);
        kamu.setSaldo(500000);
        kamu.setPIN(250502);

        System.out.println("Saldo awal aku: " + aku.getSaldo());
        System.out.println("Saldo awal kamu: " + kamu.getSaldo());
        System.out.println("Nomor PIN aku: " + aku.getPIN());
        System.out.println("Nomor PIN kamu: " + kamu.getPIN());
    }
}

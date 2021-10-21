package com.fajar.pbo.modul3.latihan;

public class Tabungan {
    public int saldo;

    public Tabungan (int iniSaldo){
        this.saldo = iniSaldo;
    }
    public int getSaldo() {

        return saldo;
    }
    public void simpanUang(int jumlah){

        saldo += jumlah;
    }
        public boolean ambilUang(int jumlah) {
            if (saldo >= jumlah){
                saldo -= jumlah;
                return true;
            }
            return false;
        }
}

package com.fajar.pbo.modul5.latihan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    public Tabungan(){
        this(5000);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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

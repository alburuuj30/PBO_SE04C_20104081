package com.fajar.pbo.modul3.percobaan;

public class Tabungan {

    //Atribute
    public int saldo;

    //Constructor Method
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    //Method
    public void AmbilUang(int jumlah){
        saldo -= jumlah;
    }
}

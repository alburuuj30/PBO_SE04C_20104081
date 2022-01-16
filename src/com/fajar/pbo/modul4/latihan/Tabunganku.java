package com.fajar.pbo.modul4.latihan;

public class Tabunganku {
    private String nama;
    private int noRekening, saldo, PIN;

    public Tabunganku(String nama, int noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

    public Tabunganku(String nama, int noRekening, int PIN){
        this.nama = nama;
        this.noRekening=noRekening;
        this.PIN=PIN;
    }
    public void simpanUang (int jumlah){
        this.saldo += jumlah;
    }
    public boolean tarikUang(int jumlahTarik){
        if (jumlahTarik <= getSaldo()){
            saldo-=jumlahTarik;
            return true;
        }
        else {
            return false;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
}

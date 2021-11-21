package com.fajar.pbo.modul7.latihan;

public class View {
    public static void main(String[] args) {
        Employee e = new Employee("Ahzar",1200000);
        Employee em = new Manager("Ali",2500000,"Software Engineering");
        System.out.println("Data employee :"+e.getDetails());
        System.out.println("\nData manager :"+em.getDetails());
        em.cetak();
    }
}

package com.fajar.pbo.modul7.latihan;

public class Employee {
    private String name;
    private double salary;
    protected Employee(String n, double s) {
        name = n;
        salary = s;
    }
    protected String getDetails() {
        return "\nName \t: "+name+ "\nSalary \t: "+salary;
    }
    public void cetak() {
        System.out.println("coba di Employee");
    }
}

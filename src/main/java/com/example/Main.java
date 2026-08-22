package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("pruebas ejercicio 1");
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("harry potter","j.k rowling");
        l2.mostrarDetalles();
        System.out.println();

        System.out.println("pruebas ejercicio 2");
        CuentaBancaria cuenta = new CuentaBancaria("maria", 500);
        cuenta.Depositar(200);
        System.out.println("saldo actual:" + cuenta.getSaldo());
        cuenta.Retirar(1000);
        System.out.println();

        System.out.println("pruebas ejercicio 3");
        Estudiante e = new  Estudiante(" pedro", 21,2.5);
        e.mostrarInformacion();
    }
}
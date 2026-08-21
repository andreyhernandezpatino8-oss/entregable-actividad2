package com.example;

public class CuentaBancaria {
    private String titular ;
    private double saldo ;

    public CuentaBancaria (String titular, double saldoinicial){
        this.titular = titular;
        if (saldoinicial <0){
            this.saldo =0;
        }else {
            this.saldo = saldoinicial;
        }
        }
    public String gettitular(){
        return titular;
    }
    public void settitular (String titular){
        this.titular = titular;
    }
    public double getsaldo(){
        return saldo;
    }
    public void depositar (double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
        }else{
            System.out.println("la cantidad a depositar debe ser mayor a 0");
        }
    }
    public void retirar(double cantidad){
        if (cantidad <= 0) {
            System.out.println("la cantidad a retirar debe ser mayor a 0");
        }else if (cantidad > saldo){
            System.out.println("fondos insuficientes");
        }else {
            saldo -= cantidad;
        }
    }
    }

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
    public String getTitular(){
        return titular;
    }
    public void setTitular (String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void Depositar (double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
        }else{
            System.out.println("la cantidad a depositar debe ser mayor a 0");
        }
    }
    public void Retirar(double cantidad){
        if (cantidad <= 0) {
            System.out.println("la cantidad a retirar debe ser mayor a 0");
        }else if (cantidad > saldo){
            System.out.println("fondos insuficientes");
        }else {
            saldo -= cantidad;
        }
    }
    }

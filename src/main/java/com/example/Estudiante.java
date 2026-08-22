package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;
    Estudiante(){
        this.nombre = "sin nombre";
        this.edad = 18;
        this.promedio = 0.0;
    }
    public Estudiante( String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad =edad;
        this.promedio = promedio;
    }
    public String getNombre (){
        return nombre;
     }
     public void setNombre (String nombre){
        this.nombre = nombre;
     }
     public int getEdad (){
        return edad;
     }
     public void getEdad (int edad){
        if (edad >0) {
            this.edad = edad;
        }else{
            System.out.println("la edad debe ser amor a 0");
        }
     }
     public double getPromedio (){
        return promedio;
     }
     public void setPromedio(double promedio){
        this.promedio = promedio;
    }
    public boolean Aprovado(){
        return promedio >= 3.0;
    }public void mostrarInformacion (){
        String estado = Aprovado() ? "aprobado": "reprobado";
        System.out.println("estudiante:"+nombre+ "edad:"+edad+ "promedio; "+promedio+"estado:"+estado);
    }
}
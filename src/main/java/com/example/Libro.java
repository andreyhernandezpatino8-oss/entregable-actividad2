package com.example;

public class  Libro {
    private String titulo;
    private String autor;
    private int paginas;

public Libro (){
    this.titulo = "desconocido";
    this.autor = "anonimo";
    this.paginas = 0;
}

public Libro (String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = 0;
}
public Libro ( String titulo,  String autor, int paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
}
public String gettitulo(){
    return titulo;
}
public void settitulo (String titulo){
    this.titulo =  titulo;
}
public String getautor(){
    return autor;
}
public void setautor (String autor){
    this.autor = autor;
}
public int getpaginas (){ 
    return paginas;
}
public void setpaguinas (int paginas){
    this.paginas = paginas;
}
public void mostrardetalles(){
    System.out.println("libro:" + titulo +"autor:"+autor+"paginas:"+ paginas);
}
}
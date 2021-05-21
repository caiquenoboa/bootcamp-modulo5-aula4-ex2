package com.company;

public class Book {

    private String titulo;
    private int isbn;
    private String autor;
    private boolean emprestado = false;


    public Book(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }


    public void emprestimo(){
        if(emprestado){
            System.out.println("Título já emprestado");
            return;
        }
        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

    @Override
    public String toString(){
        return titulo + ", " + isbn + ", " + autor;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

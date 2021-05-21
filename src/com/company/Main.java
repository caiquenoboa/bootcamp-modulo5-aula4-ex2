package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ContaCorrente c = new ContaCorrente();

        Fracao f1 = new Fracao(9, 3);
        Fracao f2 = new Fracao(2, 2);

        f1.multiplicar(f2);

        System.out.println(f1.toString());

    }
}

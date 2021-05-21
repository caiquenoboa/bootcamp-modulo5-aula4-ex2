package com.company;

public class ContaCorrente {

    private double saldo;
    private String name;

    public ContaCorrente(double saldo, String name){
        this.saldo = saldo;
        this.name = name;
    }

    public ContaCorrente(){
        saldo = 0;
        name = "";
    }

    public ContaCorrente(ContaCorrente conta){
        this.saldo = conta.saldo;
        this.name = conta.name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public void deposito(double valor){
        saldo += valor;
    }

    public double saque(double valor){
        if (valor > this.saldo){
            System.out.println("Não possui saldo suficiente");
            return 0;
        }
        saldo -= valor;
        return valor;
    }

    public void devolucao(double valor){
        this.saldo += valor;
    }

    public void transferencia(double valor, ContaCorrente conta_destino){
        if (valor > this.saldo){
            System.out.println("Não possui saldo suficiente");
            return;
        }
        this.saldo -= valor;
        conta_destino.saldo += valor;
        System.out.println("Transferencia realizada com sucesso");
    }
}

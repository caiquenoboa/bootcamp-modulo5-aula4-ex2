package com.company;

public class Counter {
    private int value;

    public Counter(){
        value = 0;
    }

    public Counter(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(){
        value++;
    }

    public void sub(){
        value--;
    }
}

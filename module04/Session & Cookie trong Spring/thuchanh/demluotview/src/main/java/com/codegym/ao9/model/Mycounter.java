package com.codegym.ao9.model;

public class Mycounter {
    private  int count;

    public Mycounter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Mycounter(int count) {
        this.count = count;
    }
    public  int increment()
    {
        return count++;
    }
}

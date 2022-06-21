package com.company;

public abstract class Animal {
    public void make_sound() {
        my_name();
        my_sound();
    }
    protected abstract void my_name();
    protected abstract void my_sound();
}

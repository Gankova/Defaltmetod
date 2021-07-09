package com.company;

// у нескольких имплиментируемых интерфейсов не может быть два одинаковых дефолтных метода

public interface Animal {
    void run();
    default void eat() {
        System.out.println("eat");
    };
}

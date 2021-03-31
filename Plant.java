package com.company.Task4;
/*
Створіть просту  ієрархію спадкування, яка відповідає
сутностям Рослина (властивості- назва, ареал розповсюдження, вік) та Дерева і
Квіти. Продемонструйте перевантаження конструкторів та методів, перевизначення
методів, особливості роботи конструкторів при спадкуванні.
 */
public abstract class Plant {
    protected String name;
    protected String habitat;
    protected int age;

    public Plant(String name){
        this.name=name;
    };

    public Plant(String name, String habitat){
        this.name=name;
        this.habitat=habitat;
    }

    public Plant(String name, String habitat, int age){
        this.name=name;
        this.habitat=habitat;
        this.age=age;
    }

    public abstract void plantSounds();
}

package com.academicuni.dz.superDZ;

import java.util.Vector;

public class Cage<T> {
    public static void main(String[] args){
        Cage<Dog> c = new Cage<Dog>();
        Dog d1 = new Dog(5);
        BigDog d2 = new BigDog(7);
        Cat c1 = new Cat(6);
        AddAnimal(d1, c);
        AddAnimal(d2, c);
        //AddAnimal(c1, c);
    }

    Vector<T> animals;
    public Cage(){
        animals = new Vector<T>();
    }
    public static <T1> void AddAnimal(T1 an, Cage<? super T1> c) {
        c.animals.add(an);
    }
}

package com.academicuni.PetStore;

public class Human extends Animal {
    protected String surname;
    public Human(String nm, String sn, boolean g){
        super("Homo Sapiens", "Human", nm, g);
        surname = sn;
    }
    public Human(Human h){
        super("Homo Sapiens", "Human", h.name, h.gender);
        surname = h.surname;
    }
    public String getSurname(){
        return surname;
    }
    public String getFullName(){
        return name + " " + surname;
    }
}


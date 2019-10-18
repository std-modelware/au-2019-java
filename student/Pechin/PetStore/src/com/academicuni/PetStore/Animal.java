package com.academicuni.PetStore;

public class Animal {
    protected String species;
    protected String shortName;
    protected String name;
    boolean gender;

    public Animal(String sp, String sn, String nm, boolean g){
        species = sp;
        shortName = sn;
        name = nm;
        gender = g;
    }
    public Animal(Animal an) {
        species = an.species;
        shortName = an.shortName;
        name = an.name;
        gender = an.gender;
    }

    public String getSpecies(){
        return species;
    }
    public String  getShortName(){
        return shortName;
    }
    public String getName(){
        return name;
    }
    public boolean getGender(){
        return  gender;
    }

}

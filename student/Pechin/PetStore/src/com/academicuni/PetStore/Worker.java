package com.academicuni.PetStore;

import java.util.HashSet;
import java.util.Set;

public class Worker extends Human {
    protected HashSet<Speciality> specialities;
    boolean free;
    public Worker(String nm, String snm, boolean g) {
        super(nm, snm, g);
        specialities = new HashSet<Speciality>();
        free = true;
    }
    public Worker(Worker w){
        super(w.name, w.surname, w.gender);
    }
    public void addSpeciality(Speciality s){
        specialities.add(s);
    }
    public void removeSpeciality(Speciality s){
        specialities.remove(s);
    }
    boolean checkSpeciality(Speciality s){
        return specialities.contains(s);
    }
    boolean isFree(){
        return free;
    }
    void assign(){
        free = false;
    }
    void unassign(){
        free = true;
    }
}

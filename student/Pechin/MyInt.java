package com.academicuni.dz;

public class MyInt {
    int n;
    public MyInt(Integer a){
        n = a;
    }
    @Override
    public int hashCode() {
        return 4;  // SUPER GOOD HASH FUNCTION DO NOT STEEL
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyInt)){
            return false;
        }
        MyInt m = (MyInt) obj;
        return m.n == n;
    }

}
package ru.au2019.java;

public class LMethodParameter {
    public static void main(String[] args) {
        System.out.println("LMethodParameter");
        // При вызове методов все параметры передаются ПО ЗНАЧЕНИЮ
        // Бывают два типа переменных: примитивные (базовые) и объекты (ссылки)

        LMethodParameter lmp = new LMethodParameter();
        int i = 10;
        lmp.primitiveParameter(i);
        System.out.println("outside primitiveParameter() i = " + i);

        LMethodParameter lmp2 = new LMethodParameter(10);
        LMethodParameter lmp3 = new LMethodParameter(20);
        //lmp2.linkParameter(lmp3);

        System.out.println("lmp2.member = " + lmp2.member); // 10
        System.out.println("lmp3.member = " + lmp3.member); // 20

        LMethodParameter.swap(lmp2, lmp3);

        System.out.println("lmp2.member = " + lmp2.member); // 10
        System.out.println("lmp3.member = " + lmp3.member); // 20

        System.out.println("LMethodParameter");
    }

    public void primitiveParameter(int i) {
        i++;
        System.out.println("inside primitiveParameter() i = " + (++i));
        System.out.println("inside primitiveParameter() i = " + (i++));
        System.out.println("inside primitiveParameter() i = " + i);
    }

    ////////////////////
    public int member;

    public LMethodParameter(int member) {
        this.member = member;
    }

    public LMethodParameter() {
        this.member = 0;
    }

    public void updateMember(int member) {
        this.member = member;
    }

    public void linkParameter(LMethodParameter lmp) {
        lmp.updateMember(100);
    }


    /////////////////
    public static void swap (LMethodParameter p1 /*10*/, LMethodParameter p2 /*20*/) {
        LMethodParameter tmp = p1; // tmp = 10
        p1 = p2; // p1 = 20
        p2 = tmp; // p2 = 20, 10
    }

}

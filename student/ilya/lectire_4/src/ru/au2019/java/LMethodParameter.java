package ru.au2019.java;

public class LMethodParameter {
    public static void main(String[] args) {
        System.out.println("LMethodParameter");

        LMethodParameter lmp = new LMethodParameter();
        int i = 10;
        lmp.primitiveParameter(i);

        LMethodParameter lmp2 = new LMethodParameter(10);
        LMethodParameter lmp3 = new LMethodParameter(20);

        //lmp2.linkParameter(lmp3);

        System.out.println("lmp2.member = " + lmp2.member);
        System.out.println("lmp3.member = " + lmp3.member);

        LMethodParameter.swap(lmp2, lmp3);

        System.out.println("lmp2.member = " + lmp2.member);
        System.out.println("lmp3.member = " + lmp3.member);

        System.out.println("LMethodParameter");
    }

    public void primitiveParameter(int i) {
        i++;
        System.out.println("inside primitiveParameter() i = " + (++i));
        System.out.println("inside primitiveParameter() i = " + (i++));
        //примитивные типы передаются по значению
    }

    public int member;


    public LMethodParameter(int member) {
        this.member = member;
    }


    public LMethodParameter() {}


    public void updateMember(int member) {
        this.member = member;
    }


    public void linkParameter(LMethodParameter lmp) {
        lmp.updateMember(100);
    }


    public static void swap (LMethodParameter p1, LMethodParameter p2) {
        LMethodParameter tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

}

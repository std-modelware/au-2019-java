package ru.au2019.java.innerclass;

public class LInnerClass {
    public static void main(String[] args) {
        System.out.println("LInnerClass");
        LInnerClass lic = new LInnerClass();
        lic.MYMethod();

        class MIC {
            private int i = 123;
            public void printI() {
                System.out.println(this.i);
            }
        };

        MIC mic = new MIC();
        mic.printI();
    }

    public class LInnerClass1 {
        public void Method() {
            System.out.println("LInnerClass1::Method() " + LInnerClass.this.value);
        }

    }

    public interface LInnerInterface {
        void MMM();
    }

    private  LInnerClass1 lic1;
    private LInnerInterface lii1;
    private int value = 100;

    public LInnerClass() {
        this.lic1 = new LInnerClass1();
        this.lii1 = new LInnerInterface() {
            @Override
            public void MMM() {
                System.out.println("MMM");
            }
        };
    }

    public void MYMethod() {
        this.lic1.Method();
        this.lii1.MMM();
    }
}

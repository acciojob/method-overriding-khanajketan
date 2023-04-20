package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        String ans1 = b.meth();
        String ans2 = b.meth();
    }
    public class A{
        public String meth(){
            return "Invoking method from class A";
        }

    }
    public static class B{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

}

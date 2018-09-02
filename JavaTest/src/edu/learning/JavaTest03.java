package edu.learning;

public class JavaTest03 {
    static { System.out.println("Test compile and run");}
}

class JavaTest03A {
    static char b;
    final int z = 8;
    static String p = "";

    public static void main(String... args){
        int a = Integer.decode("10");
        System.out.println(a);
        System.out.println(Integer.decode("100"));
        System.out.println(new Integer("5"));
        System.out.println(Integer.valueOf("50"));
        System.out.println("-"+b+"-");
        final int x;
        int w =5;
        x = 8;
        short s = 8;
       
    }
}

class Example {
    static int numero = 9;
    int num = 90;
}

class JavaTest03B {
    public static void main(String... args){
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean("false"));
        System.out.println(new Boolean("T"));

        Example example = new Example();
        example = null;
        int n = example.numero;
        //int m = example.num;
        System.out.println("Number is " + n);
    }

    public void test(boolean param){
        int j;
        if(param) j = 0;
        //System.out.println(j);
        double i = 0.5;
        double k = 0.5d;
        double h = 0.5D;
    }
}
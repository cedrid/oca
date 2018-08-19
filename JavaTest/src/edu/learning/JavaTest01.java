package edu.learning;

public class JavaTest01 {
    static int x = 4;
    public static void main (String... args){
        for(int x = 5; x<10 ;x++)
            x++;
        System.out.println(x);
        int x = 100;
        System.out.println(x);
    }
}


class JavaTest01a {
    public static void main (String ...args){
        int x = 8;
        int y = 5;
        for(; x>-1 ;x--)
            System.out.println(x);;
        System.out.println("valor final de x:" + x);
        System.out.println("valor final de y:" + y);
    }
}
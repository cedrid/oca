package edu.learning;

public class JavaTest04 {

    public  static  void main(String... args){
        System.out.println(1921222%Short.MAX_VALUE);
        System.out.println((short)1921222);

        System.out.println((Short.MAX_VALUE+1)%Short.MAX_VALUE);
        System.out.println((short)(Short.MAX_VALUE));
        {System.out.println((short)(Short.MAX_VALUE+1));}
        System.out.println((short)(Short.MAX_VALUE));
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);
    }

}

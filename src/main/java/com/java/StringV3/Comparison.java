package com.java.StringV3;

public class Comparison {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";
        String c = a;
        System.out.println(c == a);
        // ==
        System.out.println(a == b);

        String name1 = new String("John");
        String name2 = new String("John");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}

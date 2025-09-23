package com.java.StringV3.MemoryAllocation;

public class MemoryAllocationImpl {
    // int a=10;
    // Stack-----> To store the reference of the variable.
    // Heap-------> To store the object of the variable.
    public static void main(String[] args) {
        String name1="Rahul";
        String name2="Rahul";
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1==name2); // true

        String name3=new String("Rahul1");
        System.out.println(name3.hashCode());
        System.out.println(name3.equals(name1));

        // == ----> refers the reference of the variable.
        // .equalsTo(obj2)---> refers to the value of the variable.
        //
    }
}

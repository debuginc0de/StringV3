package com.java.StringV3.StringImpl.Basic;

public class reverseString {
    public static void main(String[] args) {
        String s="rahul";
        System.out.println(new StringBuilder(s).reverse());
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.println(res);
    }
}

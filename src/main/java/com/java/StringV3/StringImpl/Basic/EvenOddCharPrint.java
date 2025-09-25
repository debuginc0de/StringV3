package com.java.StringV3.StringImpl.Basic;

public class EvenOddCharPrint {
    public static void main(String[] args) {
        String str="abcdefghi";
        String odd="";
        String even="";
        for (int i=0;i<str.length();i++){
            if (i%2==0){
                even+=str.charAt(i);
            }
            else{
                odd+=str.charAt(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

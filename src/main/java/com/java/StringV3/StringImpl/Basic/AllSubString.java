package com.java.StringV3.StringImpl.Basic;

public class AllSubString {
    public static void main(String[] args) {
        String str1="abcdefg";
        for(int i=0;i<str1.length();i++){
            for (int j=0;j<=i;j++){
                System.out.print(" "+str1.substring(j,i+1));
            }
        }
    }


}

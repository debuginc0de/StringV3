package com.java.StringV3.StringImpl.Basic;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharacter {
    public static void main(String[] args) {
        String str="aabcdeefghgi";
        Set<Character> set=new HashSet<>();
        for (int i=0;i<str.length();i++){
            if (!set.add(str.charAt(i))){
                System.out.println("Duplicate--> "+str.charAt(i));
            }
        }
        System.out.println(str);
    }
}

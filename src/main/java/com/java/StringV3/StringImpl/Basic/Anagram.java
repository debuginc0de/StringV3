package com.java.StringV3.StringImpl.Basic;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s1="cbda";
        String s2="abcd";

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s2.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (char ch:s1.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0){
                    map.remove(ch);
                }
                else{
                    System.out.println("false");
                }
            }
        }
        System.out.println("true");
    }
}

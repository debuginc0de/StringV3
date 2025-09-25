package com.java.StringV3.StringImpl.Basic;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=254789634;
        StringBuilder sb=new StringBuilder(""+Math.abs(num));
        int res=Math.abs(Integer.parseInt(sb.reverse().toString()));
        System.out.println(num>0?res:"-"+res);
    }
}

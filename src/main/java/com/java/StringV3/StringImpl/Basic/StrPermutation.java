package com.java.StringV3.StringImpl.Basic;

public class StrPermutation {
    private String swap(String s,int i,int j){
        char temp;
        char[] ch=s.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;

        return String.valueOf(ch);
    }
    private void cal(String s2,int left,int right){
        if (left==right){
            System.out.println(s2);
        }
        else {
            for (int i=left;i<=right;i++){
                String swaped=this.swap(s2,left,i);
                this.cal(swaped,left+1,right);
            }
        }
    }
    public static void main(String[] args) {
        String s1="abc";
        int n=s1.length();
        StrPermutation stp=new StrPermutation();
        stp.cal(s1,0,n-1);
    }
}

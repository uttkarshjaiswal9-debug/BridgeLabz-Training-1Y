package com.gla.generics;

public class fibanociii {
    public static <T> void fibanociii(T n){
        int num=Integer.parseInt(n.toString());
        int a = 0,b = 1;
        if(num==0){
            System.out.println("no series");
        }
        System.out.println(a+"\n"+b);
        for(int i=2;i<num;i++){
            int sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    public static void main(String[]args){
        fibanociii(5);
    }
}

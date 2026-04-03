package com.gla.generics;

import java.lang.Number;

public class fiboo {
    public static <T extends Number> void fiboo(T n){
        int sums = n.intValue();
        int a = 0 , b = 1 ;
        System.out.println(a +"\n" +b);
        for ( int i = 2 ; i < sums ; i++){
            int sum = a + b ;
            System.out.println(sum);
            a = b ;
            b = sum ;
        }
    }
    public static void main (String[] args){
        fiboo(5);
        System.out.println("\n");
        fiboo("7");
        fiboo(8);
    }
}
}

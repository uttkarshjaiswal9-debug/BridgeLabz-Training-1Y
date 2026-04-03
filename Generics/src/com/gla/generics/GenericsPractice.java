package com.gla.generics;
class Number<T>{
    T num;

    void setNumber(T num){
        this.num=num;
    }
    T getNumber(){
        return num;
    }
}
public class GenericsPractice {
    public static void main (String[] args){
        Number<Integer> n1 = new Number<>();
        n1.setNumber(23);
        System.out.println(n1.getNumber());
        Number<Double> n2 = new Number<>();
        n2.setNumber(690.00000);
        System.out.println(n2.getNumber());
        Number<Character> n3 = new Number<>();
        n3.setNumber('h');
        System.out.println(n3.getNumber());
        Number<String> n4 = new Number<>();
        n4.setNumber("Uttkarsh");
        System.out.println(n4.getNumber());
    }
}


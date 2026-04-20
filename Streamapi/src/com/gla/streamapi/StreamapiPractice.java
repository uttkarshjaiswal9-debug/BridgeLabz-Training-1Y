package com.gla.streamapi;

interface Sum{
    int add (int a,int b);
        }
interface StringLength {
    int getLength(String s);
}
interface Number {
    boolean checker(int n);

    public class StreamapiPractice {
//    public int stringLength(){
//
//    }

        //    (String s) ->{
//        return s.length();
//
//    };
//    (int a,int b) -> {
//    int c= a+b;
//    return c;
//    };
        public static void main(String[] args) {
            // Lambda expression for sum of two no.
            Sum first = (int a, int b) -> (a + b);
            System.out.println(first.add(10, 20));
            // lambda expression for stringLength
            StringLength obj = (s) -> s.length();
            System.out.println(obj.getLength("Uttkarsh"));
            // lambda expression for positive negative no.
            Number isPositive = (n) -> n > 0;
            System.out.println(isPositive.checker(10));
            System.out.println(isPositive.checker(-5));


        }
    }
}

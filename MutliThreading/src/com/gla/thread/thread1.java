package com.gla.thread;

class thread extends Thread{
    public void run(){
        System.out.println("This is Thread Running");
    }
}
public class thread1{
    public static void main (String[] args)
    {
        thread t1 = new thread();
        t1.start();
    }
}
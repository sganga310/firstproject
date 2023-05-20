package com.basics;

public class Hello {
    String info ="hello World";
   // System.out.println("Hello world");
    /* Printing Hello World" */
    public static void main(String[] args){
        Bacademy bacademy =new Bacademy();
        System.out.println(bacademy.coursedetails());
       Hello h = new Hello();
       for(int i=0; i<=100; i++)
            System.out.println(h.info);
    }
}

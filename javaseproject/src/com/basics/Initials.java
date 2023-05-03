package com.basics;
/* Printing the initials"*/
public class Initials {
    public static void main(String[] args) {
       /* System.out.println("           ****         ****");
        System.out.println("          *            *");
        System.out.println("          *            *");
        System.out.println("           ****        *");
        System.out.println("               *       *       ****");
        System.out.println("              *        *       *   *");
        System.out.println("          ***           *******    *");*/


        String[] initials = {"           ****         ****", "          *            *",
                "          *            *","           ****        *","               *       *       ****",
                "              *        *       *   *","          ***           *******    *"};
        for (int i = 0; i < initials.length; i++) {
            System.out.println(initials[i]);
        }
    }
}


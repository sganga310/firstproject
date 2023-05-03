package com.basics;

public class HelloWorldMultilingual{

    public static void main(String[] args)
    {
        int lang=1;
        switch (lang){
            case 1:
                //Hello world in english
                System.out.println("Hello World");
                break;
        //Hello world in telugu
            case 2:    System.out.println("హలో వరల్డ్!");
                break;
            case 3:
                System.out.println("ஹலோ உலகம்!");
                break;
            case 4:
                System.out.println("\"สวัสดีโลก!\"");
                break;
            default:
                System.out.println("Please enter a number from 1 to 4 to opt for ");

        }
    }
        }

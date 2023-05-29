package day_01;

import java.util.Scanner;

public class c04_MethodCreation {
    //konsole;
     /*
        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
         */
    public static void main(String[] args) {
        yazdir();
        yazdir();
        yazdir();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı giriniz");
        String name = scan.next();
        System.out.println(name);
        
    }

    //syntax: Access modifier + static keyword + return type + methodismi(){} ....> {body} kodlarin yazildigi yerdir
    public static void yazdir(){

        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");
    }




}

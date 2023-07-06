package practice02;

import java.util.Random;
import java.util.Scanner;

public class Odev_Random {
    public static void main(String[] args) {


        String answer = "";

        System.out.println("Please enter a number");

        Random rnd = new Random();

        int sayi = (int) Math.floor(Math.random() * 101);

        int counter = 10;

        do {
            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            if (sayi == number) {

                counter *= 10;

                System.out.println("Congratulations! You won the game , " +
                        "If you want to play please enter '1' If you want to exit please enter any character" + counter);

                answer = input.next();

            } else if (sayi > number) {

                System.out.println("Please decrease your number");
                counter--;

            } else {

                System.out.println("Please increase your number");
                counter--;

            }
            if (counter == 0) {

                System.out.println("You lost the game... If you want to play please enter '1' If you want to exit please enter any character");
                answer = input.next();
            }

        }
        while (!answer.equals("1"));

    }
}
package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class KelimeOyunu01 {
    public static void main(String[] args) {
        String word = "love";
        int guess = 0;
        int counter = 0;
        int right = 0;
        String[] length = new String[word.length()];
        System.out.println(Arrays.toString(length));

        System.out.println("you have 4 guess to find right words");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < word.length(); i++) {
            length[i] = " _ ";
        }
        while (guess < 5) {
            System.out.println("Enter a letter ");
            String letter = input.next();
            guess++;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter.charAt(0))
                    length[i] = letter + " ";
                counter = 1;
                right++;
                if (right == word.length()) {
                    System.out.println(" Congragulations !");
                    break;
                }
            }
        }
        if (counter == 1) {
            counter = 0;
            guess--;
        }
        for (int i = 0; i < word.length(); i++) {
            System.out.println(length[i]);
        }
        System.out.println();


      if (right != word.length()){
          System.out.println("You couldnt guess right one");
          System.out.println("Right answer : " + word);
      }


    }

}

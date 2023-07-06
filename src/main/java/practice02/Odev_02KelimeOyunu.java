package practice02;

import java.util.Random;
import java.util.Scanner;

public class Odev_02KelimeOyunu {
    public static void main(String[] args) {
           /*
        Kelime Tahmin Oyunu
        Kullanıcının bir kelimeyi harf harf tahmin ederek doğru kelimeyi bulmasını sağlayan bir oyun geliştirin.
        Oyun şu adımları içermelidir:

        - Bir kelime listesi tanımlayın. Bu listede en az 5 farklı kelime bulunsun.
        - Oyuncu, listeden rastgele seçilen bir kelimeyi tahmin etmeye çalışmalıdır.
        - Oyuncuya, seçilen kelimenin uzunluğu kadar alt tire "_" işaretinden  oluşan bir dizi gösterilmelidir.
          Örneğin, seçilen kelime "elma" ise "____" şeklinde bir gösterim yapılmalıdır.
        - Oyuncu, her tahmininde bir harf girmelidir.
            - Girdiği harf, seçilen kelimede bulunuyorsa, doğru tahmin olduğu belirtilmeli ve
              ilgili harf yerine konulmalıdır.
            - Oyuncu, yanlış tahminlerde bulunduğunda, kalan hakkı azalmalıdır.
              Başlangıçta oyuncunun 5 hakka sahip olduğu varsayılmalıdır.
        - Oyuncunun doğru kelimeyi bulması durumunda, tebrik mesajı gösterilmeli ve oyun sonlandırılmalıdır.
        - Oyuncunun kalan hakları sıfır olduğunda, olumsuz bir mesaj ve doğru kelime gösterilmelidir.
     */
        /*
        ArrayList<String>words = new ArrayList<>();
        words.add("School");
        words.add("Home");
        words.add("College");
        words.add("Garden");
        words.add("Hospital");
        */
       // String words[] = {"School","Home","College","Garden","Hospital"};

       // String uzunluk[] = new String[words.length];

        Scanner input = new Scanner(System.in);
        System.out.println("you have 5 right to find right word!");
        String userWords = input.next();
        Random rdn = new Random();
        int a = rdn.nextInt(5);
        int counter = 0;
        while(counter <6){

            System.out.println("Please enter a letter.");

            String letter = input.nextLine();

            counter++;



        }/*
        for (int i = 0; i < words.length; i++) {
            uzunluk[i] = "_";
        }
        System.out.println(uzunluk);*/






















    }
}

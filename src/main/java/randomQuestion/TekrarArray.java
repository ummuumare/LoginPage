package randomQuestion;

import java.util.Arrays;

public class TekrarArray {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        soru2) 2 tane list olusturun ve bu listlerden biri digerini iceriyor mu diye kontrol edin
                contains
        soru3) bir list olusturun ve bu listteki elemanlari alfabetik siraya gore siralayin
        collections.sort()
        soru 4) elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu istegimiz
        yeni urunle degistirip eski urunu
        varolan eski urunler listesine ekleyelim

         5)bir dogal sayi listesi olusturun ve olusturdugunuz listedeki tum ogeleri toplayın
         6) bir liste olusturun ve listede kac tane elemanin oldugunu yazdirin*/

        int numbers [] = {1,2,3,4,5,6,7,8,9};
       int num = 1234;
       int newN []= new int[numbers.length+1];
        for (int i = 0; i <newN.length ; i++) {
            if (i<numbers.length){
                newN[i] = numbers[i];
            }else {
                newN[i] =num;
            }
            System.out.println(Arrays.toString(newN));
        }

      //  2 tane list olusturun ve bu listlerden biri digerini iceriyor mu diye kontrol edin
        //        contains

        int []birinci = {1,2,3,4,5,6};
        String [] kelimeler = {"ay","yildiz","burc","umm"};
       // boolean
        //for (int w : birinci) {-
         //   if (){

            }
        }


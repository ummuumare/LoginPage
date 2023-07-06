package randomQuestion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdamAsmaca {

    public  static void adamAsmaca() {
        List<String> renkler = List.of("beyaz", "sari", "siyah", "kirmizi", "mor", "yesil");
        Scanner input = new Scanner(System.in);
        Random rdm = new Random();
        int randomIdx = rdm.nextInt(renkler.size());

        String rastgeleRenk = renkler.get(randomIdx);

        System.out.println(rastgeleRenk);

        ArrayList<String> bos = new ArrayList<>();

        for (int i = 0; i < rastgeleRenk.length(); i++) {
            bos.add("_");
        }
        System.out.println(String.join("", bos));

        int can = 5;
        System.out.println("Adam asmaca oyununa hosgeldiniz!");

        do {
            System.out.println("Lutfen bir harf tahmin ediniz");

            String tahmin = input.next().substring(0, 1).toLowerCase();

            if (rastgeleRenk.contains(tahmin)) {

                System.out.println("dogru tahmin !!");

                for (int i = 0; i < rastgeleRenk.length(); i++) {

                    if (rastgeleRenk.substring(i, i + 1).equals(tahmin)) {
                        bos.set(i, tahmin);
                    }

                }
                System.out.println(String.join("", bos));

                if ((String.join("", bos).equals(rastgeleRenk))){
                    System.out.println("Oyunu kazandiniz tebrikler !");
                    break;
                }
            }else {
                    can--;
                System.out.println("Uzgunuz yanlis tahmin  " + can + " hakkiniz kaldi.");
                }

        }while (can>0);

        if (can==0){
            System.out.println(" Cevap : " + rastgeleRenk +  " Oyunu kaybettiniz");
        }
    }


    }


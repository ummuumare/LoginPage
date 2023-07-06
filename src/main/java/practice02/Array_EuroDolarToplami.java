package practice02;

import java.sql.Array;
import java.util.Arrays;

public class Array_EuroDolarToplami {
    public static void main(String[] args) {
         /*Ornek1 :
               Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
                String str ="$1 $12 €34 €56 $45 €78";
               dolarToplami: 58
               euroToplami: 168
            */

        String str ="$1 $12 €34 €56 $45 €78";

        String [] arr = str.split(" ");

        String strArr = Arrays.toString(arr);
        System.out.println(strArr);
        int dolarToplam = 0;
        int euroToplam = 0;

        for (String w : arr ){
            if (w.startsWith("€")){
              int euroDeger = Integer.parseInt(w.substring(1));//Java string e koy dedigi icin parseInt cikti onumuze
                euroToplam+=euroDeger;

            }else if (w.startsWith("$")){
                int dolarDeger = Integer.parseInt(w.substring(1));//Java string e koy dedigi icin parseInt cikti onumuze
                dolarToplam+=dolarDeger;
            }
        }
        System.out.println("Euro Toplam: " + euroToplam);
        System.out.println("Dolar Toplam : " + dolarToplam);
    }
}

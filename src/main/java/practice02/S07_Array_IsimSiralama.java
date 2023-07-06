package practice02;

import java.util.Arrays;

public class S07_Array_IsimSiralama {
    public static void main(String[] args) {
         /*
        Bir sınıfta bulunan öğrencilerin isimlerini içeren bir array verildiğinde,
        bu öğrencilerin isimlerini sıralayan bir program yazın.
        {"Ali", "Zeynep", "Mehmet", "Ayşe"}*/

    
        String isimler[] =  {"Ali", "Zeynep", "Mehmet", "Ayşe"};

        Arrays.sort(isimler);

        System.out.println("Siralanmis ogrenci isimleri : " + Arrays.toString(isimler));

    }
}

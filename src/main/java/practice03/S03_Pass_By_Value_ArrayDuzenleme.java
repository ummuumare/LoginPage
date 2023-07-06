package practice03;

import java.util.Arrays;

public class S03_Pass_By_Value_ArrayDuzenleme {
    /*
       Bir isimler arrayi içinde verilmiş bir ismin orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
           String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
           - Her bir ismin tüm harflerini büyük yapın.
           - Her bir ismin tüm harflerini küçük yapın.
           - Her bir ismin başına ünvan ekleyin.
           - Her bir isimde sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
           - Her bir ismin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
   */
    public static void main(String[] args) {
        String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
        System.out.println(Arrays.toString(isimler));

        tumuBuyuk(isimler);
        System.out.println(Arrays.toString(isimler));

    }
    public static void tumuBuyuk(String[] arr) {
        for (String w : arr) {
            w = w.toUpperCase();
            System.out.println(w);
        }
    }

}

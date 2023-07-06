package practice04;

public class S03_Varargs_KargoSirketi {
      /*
        Bir kargo şirketi, gönderilen paketlerin toplam ağırlığını hesaplayan bir metot yazmanızı istiyor.
        Metot, paketlerin ağırlıklarını almalıdır. Paketlerin toplam ağırlığını döndüren ve
        hiç paket gönderilmediğinde 0 döndüren bir metot yazın.
    */
      public static void main(String[] args) {
       double toplam = toplamAgirligiHesaplama(1.5,2.8,1.7,31.32);
          System.out.println(toplam);
      }
      public static double toplamAgirligiHesaplama(double... paketler){
          int toplamAgirlik = 0;

          for (double agirlik : paketler) {

             toplamAgirlik += agirlik;
          }

          return toplamAgirlik;
      }
}

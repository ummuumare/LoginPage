package practice03;

public class S02_PassByValue_SayiDuzenleme {
     /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */
     public static void main(String[] args) {
         int sayi = 42;
         System.out.println(sayi);//42
        karesiniAl(sayi);
         System.out.println(sayi);//1764
         System.out.println(sayi);//1764
         kupunuAl(sayi);//
         System.out.println(sayi);
        karekokunuAl(sayi);//6
         System.out.println(sayi);
         mutlakDegerAl(sayi);
         onIleCarpma(sayi);
     }
     public  static int karesiniAl(int deger){
         deger =(int) Math.pow(deger,2);
         System.out.println(deger);

         return deger;
     }

    public  static void kupunuAl(int deger){

        deger =(int) Math.pow(deger,3);

        System.out.println(deger);
    }
    public static void karekokunuAl(int deger){

         deger =(int) Math.sqrt(deger);

        System.out.println(deger);
    }
    public static void mutlakDegerAl (int deger){
         deger = Math.abs(deger);
        System.out.println(deger);
    }
     public static void onIleCarpma(int deger){
         deger = deger*10;
         System.out.println(deger);
     }










}

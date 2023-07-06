package practice02;

import java.util.Arrays;

public class S08_Array_ETicaret {
    public static void main(String[] args) {
         /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */
        String urunler[] =  {"Telefon", "Bilgisayar", "Klavye", "Mouse"};

         String arananUrun = "Klavye";
         boolean urunVarMi = false;
         for (String w : urunler){
              if (w.equals(arananUrun)){
                  System.out.println("aranan urun bulunmustur.");
                  urunVarMi= true;
                  break;
              }
         }
        // Arrays.sort(urunler) ve binarySearch ile de yapilir
        if (urunVarMi){
            System.out.println("Sepetinizde " + arananUrun + "bulunmaktadır.");
        }else {
            System.out.println("Sepetinizde " + arananUrun + "bulunmamaktadır.");
        }

    }
}

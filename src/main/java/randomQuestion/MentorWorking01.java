package randomQuestion;

public class MentorWorking01 {
    public static void main(String[] args) {/*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.*/
        String word = " Ali Can ";
       String  son = word.trim().substring(6);
      System.out.println(son);

       /*
        String a = " Miami 33018!!! ";
        int karakterSayisi = a.replaceAll("[^a-zA-Z0-9]", "").length();
        System.out.println(karakterSayisi);

        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.

        String b = "Ummu Umare ";
        int harf = b.trim().length();
        char sonuc = b.charAt(harf-1);
        System.out.println(sonuc);

        Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        sembol olmalıdır.
        Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        String password = "!1a2 3b4";
        boolean isRight = password.replaceAll(" ", "").length()>7;
        boolean varMi = password.replaceAll("a-zA-Z0-9","").replaceAll(" ","").length()>0;
        System.out.println(isRight && varMi);
*/
    }
}

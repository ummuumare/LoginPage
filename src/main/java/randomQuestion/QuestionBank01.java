package randomQuestion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionBank01 {
    //Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların toplamını konsola yazdırınız.
    public static void main(String[] args) {
        double shoes = 23.4;
        double tshirt = 13.4;
        double jewellry = 45.6;
        System.out.println(shoes + tshirt+ jewellry);
        //Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
   long a = 2348l ;
   float b = 345689f;
   int c = 124;
    float sonuc = (a*b*c);
    //DecimalFormat lessNum = new DecimalFormat();
   // String total = lessNum.format(sonuc);
       // DecimalFormat num =new DecimalFormat();
      //  String num1 = num.format(hipotenus);
       System.out.println(sonuc);
       //Basit faizi bulmak için bir kod yazınız.
      //  Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        double anapara = 2345f;
        int oran = 20;
        int yearValue = 44;
        double son = (anapara * oran*yearValue)/100;
        System.out.println("Basit faiz degeri : " +son);
//Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve
// bu değerleri iki ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
        boolean isRight = true;
        boolean isWrong = false;
        System.out.println(isWrong+ " " +isRight);
      //Bir String ve iki long data tipinde değişken oluşturunuz.
        // Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.
       String q = "hello";
       long w = 13l;
       long e = 367l;
       float toplama = w+b;
       float carpma = w*b;
       System.out.println(toplama+q+carpma);
        //3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        // Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
long ktp = 33l;
long defter = 41L;
long laptp = 1478L;
float sonc = 2 * ktp + 4 * defter + 3 * laptp;
        System.out.println(sonc);
//İki tamsayıyı değiştirmek için bir kod yazınız
       // Scanner scan = new Scanner(System.in); System.out.println("2 sayi giriniz :");
        double n1 = 23;
        double n2 = 34;
        System.out.println("Degistirmeden once : " + n1 + " - " + n2);
double toplu = n1;
  n1 =n2;
  n2 = toplu;
        System.out.println("Degisim sonrasi : " + n1 + " - " + n2);
// Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
short m = 34;
int l = m;
        System.out.println(l);
         //Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
long g = 345L;
int o = (int) g;
//Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
double A = 34;
float Z = (float) A;
/* Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
Sonrasında bu short değişkenin değerini konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktı*/
double C = 32.4;
short V = (short) C;
        System.out.println(V);
   //Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        // Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        Byte d = 23;
        double E = d;
        System.out.println(E);
        // Byte data tipinin minimum değeri ile
        // short data tipinin maksimum değerinin toplamını bulmak için bir kod yazınız.
        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        int top=(min+max);
        System.out.println(top);
        //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        // yine data tipi String olan “2351” değerini
        // short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.
        String birinci = "103";
        String ikinci ="2351";
        byte donus = Byte.valueOf("103");
        short donusturme = Short.valueOf("2351");
        System.out.println(donus - donusturme);
//sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun.
// Şehir ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
//Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
//mIaMi - Miami vb.


String sehir = "miami";
        char ilkHrf =  sehir.toUpperCase().charAt(0);
        String geriKalan =  sehir.toLowerCase().substring(1);
        System.out.println(ilkHrf+geriKalan);
//Kişi isimleri için 3 String değişken oluşturunuz.
// Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
//Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        String name = "Ali Can";
        String name1 = "Ummu Umare";
        String name2 = "Sumeyra Huma";

        int nameS = name.replace(" ","").length();
        int name1S = name1.replace(" ", "").length();
        int name2S = name2.replace(" ", "").length();

        System.out.println("Toplam karakter sayisi : " +(nameS + name1S + name2S) );

        //Bir String değişkeni oluşturunuz,
        // String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String  work = " Miami 33018!!! ";
          int bosluk =  work.trim().replace(" ","").length();

          System.out.println(bosluk);

        String s = " Miami 33018!!! ";
        Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Toplam alfabetik ve sayısal karakter sayisi:" + karakterSayisi);






















    }
}

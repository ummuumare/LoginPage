package day_01;

public class C01_Variables {

    public static void main(String[] args) {


//bir variable olustur ve yazdirin
        int yas = 30;
        //snytax: variable data turu + variable isim + atama operstor + variable deger

        int sayi = 50;
        System.out.println(yas); // control D ile satiri alt alta cogaltabiliriz
        System.out.println(34);
        // sayi = 50 seklinde yazdir
        System.out.println("sayi" + " = " + sayi);
        //sayi variable etiketiyle yazdirma
        //ctrl alt L ....> kodlarimizi duzenlemeye yarar
        //bir variable i etiketiyle birlikte yazdirmanin kisa yolu = soutv
        System.out.println("sayi = " + sayi);//sayi.
        System.out.println("yas = " + yas);//yas.
       //string bir variaable olusturun(non primtiv bir data turu, "" icinde yazilir ve buyuk harfle yzlr

        String isim = "Ali";
        //isim variable ini etiketiyle yazdir
        System.out.println("isim = " + isim);
        //olusturdugun variable i farkli bir variable a kopyala
        //yeni bir variable olusturucagim : benimYAsim ve bu variable in degeri yas variable ile ayni olacak
        //benimYasim variable deger yas variablenin degeri gibi 36 olsun
        int benimYasim = yas;
        //onunIsmi variablenin deger "Ali" olsun ve bunu kopyalama islemi ile yapalim

        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //ayni satirlari coklu variable declare et

        int yil = 2023, ay = 5, gun= 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);

        //bir variable degerini guncelle
        //az once olusturdugunuz isim variable nin degerini Veli olarak guncelle
         isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        //Java yukaridan asagiya ve soldan saga calisir

        //degiskenleri (variable)yazdir

       //camelCase
        //PascalCase
        //snake_case
        // kebab-case

        //Bir variable deklere et : x (deklara etmek = tanimlamak (data tpye ve ismi )deger atamasi yapmak zorunda degiliz)
          double x;

        //Bir variable baslat : y (baslat dedigi icin deger atamak zorundayiz)

        double y = 12.5;

        //Başka bir variable başlat : z

        double z = 33;//java buraya yazdigimiz 33 degerini 33.0 olarak algilayip hata vermedi.

        //x degişkenini y degişkeni ile başlat
        x =y;//bir variable bir scope(main method) da sadece bir kere deklare edilebilir

        //Variable y'i guncelle

        y = 13.9; // ondalikli sayilarda . kullaniyoruz(istediign sayi ile guncelleyebilirsin)

        //Degişkenleri yazdır

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
package randomQuestion;

import java.util.Scanner;

public class TurkishCoffee {
    public static void main(String[] args) {
        /*          todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                todo 3.Koşul Bölümü
        todo if(){
            Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
            Sorunun altına int kacSeker  oluşturunuz.
                    Şeker sayısını giriniz.
            Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
            todo }
        todo else{
            Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
                    Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
            (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
            String boyut oluşturun...
            todo 4.Koşul Bölümü
            eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
            (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
            Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
            Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın.
            ("Kahveniz" + boyut + "hazırlanıyor.)
            //todo  SONUÇ BÖLÜMÜ
            Siparişlerimizi verdik. Son hali görmek istiyoruz.
            konsola şunu yazdırın örnek :
            Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
                    orta boy için de String boyut ' u kullanın.)
            todo Açıklama :
            Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için"
            böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
                    Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen
            uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.*/
        do {
        String menu1 = "Turkish Coffee";
        String menu2 = "Filter Coffee";
        String menu3 = "Espresso";
        String Tercih1 = "Yes";
        String Tercih2 = "No";
        String large = "Large";
        String middle = "Middle";
        String small = "Small";
        int kacSeker;
        String  sutTercih;
        String sugar;


            Scanner input = new Scanner(System.in);
        System.out.println("Which coffee would you like ? \n1.Turkish Coffee  \n2.Filter Coffee \n3.Espresso");
        String hangiKahve = input.nextLine();

            if (hangiKahve.equalsIgnoreCase(menu1)) {
                System.out.println(menu1 + " being prepared");

                System.out.println("Would you like to add some milk ? (Yes or No)");
                 sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(Tercih1)) {
                    System.out.println("The milk is added.");

                } else if (sutTercih.equalsIgnoreCase(Tercih2)) {
                    System.out.println("No any milk inside of Turkish Coffee.");

                } else
                    System.out.println("Invalid entry");

                System.out.println("Would you like some sugar ? (Yes or No)");
                 sugar = input.next();

                if (sugar.equalsIgnoreCase(Tercih1)){
                    System.out.println("How much sugar would you like to add?");
                     kacSeker = input.nextInt();

                    System.out.println(kacSeker+ " sugar is added");
                }else  {
                    System.out.println("No any sugar inside of Turkish Coffee");
                }

            } else if (hangiKahve.equalsIgnoreCase(menu2)) {
                System.out.println(menu2 + " being prepared");

                System.out.println("Would you like to add some milk ? (Yes or No)");
                 sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(Tercih1)) {
                    System.out.println("The milk is added.");

                } else if (sutTercih.equalsIgnoreCase(Tercih2)) {
                    System.out.println("No any milk inside of Filter Coffee.");

                } else
                    System.out.println("Invalid entry");

                System.out.println("Would you like some sugar ? (Yes or No)");
                sugar = input.next();

                if (sugar.equalsIgnoreCase(Tercih2)){
                    System.out.println("How much sugar would you like to add?");
                     kacSeker = input.nextInt();

                    System.out.println(kacSeker+ " sugar is added");
                }else
                    System.out.println("No any sugar inside of Filter Coffee");

            } else if (hangiKahve.equalsIgnoreCase(menu3)) {
                System.out.println(menu3 + " being prepared");

                System.out.println("Would you like to add some milk ? (Yes or No)");
                 sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(Tercih1)) {
                    System.out.println("The milk is added.");

                } else if (sutTercih.equalsIgnoreCase(Tercih2)) {
                    System.out.println("No any milk inside of Espresso.");

                } else
                    System.out.println("Invalid entry");
                System.out.println("Would you like some sugar ? (Yes or No)");
                 sugar = input.next();

                if (sugar.equalsIgnoreCase(Tercih1)) {
                    System.out.println("How much sugar would you like to add?");
                    kacSeker = input.nextInt();

                    System.out.println(kacSeker + " sugar is added");
                }else
                    System.out.println("No any sugar inside of Espresso");
            } else
                System.out.println("Hatali tuslama girdiniz");

        }while (true);
        }
    }





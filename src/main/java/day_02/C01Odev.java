package day_02;

public class C01Odev {
    public static void main(String[] args) {
        //Iki sayinin karelerin toplamaini bulan ve yazdiran bir method olusturunuz
        //main methodun icinde tanimladigim iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun

        int a =2;
        int b =3;
        kareToplamYazdir(a,b);//buradaki parantez icindeki  variablelara argument denir

    }


    public static void kareToplamYazdir (int sayi1, int sayi2)//method parantezinin icine method body de kullanacagimiz variable
                                           // tanimliyoruz bunlara parametre denir
    {
        int toplam  = (sayi1 *sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);

    }

}

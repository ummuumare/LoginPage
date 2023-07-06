package day_01;

public class C05_MethodCreation {

//iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
//main methodun icinde tanimladigim iki sayinin kareleri toplamini bulan ve yazdiranbir method olusturun
    //(bir ogrencini yaptigi odev)public static void square(int a, int b){
    public static void main(String[] args) {
        int a;
        int b;
        karesiToplami(3, 5);
    }

    public static void karesiToplami(int a, int b) {
        int toplamDeger = (a * a) + (b * b);
        System.out.println(toplamDeger);
    }

}
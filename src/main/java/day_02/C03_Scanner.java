package day_02;
import java.util.Scanner;
public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ilk sayiyi giriniz.. ");
                   int scan1 =  scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
               int scan2 = scan.nextInt();
        boolean isEqual1 = kareleriEsitMi(scan1,scan2);

        System.out.println("isEqual = " + isEqual1);

    }
  public static boolean kareleriEsitMi(int a,int b){//Javada = atama operatoru == ise esittir demek

      boolean isEqual = (a*a)==(b*b);

      return isEqual;
  }


}

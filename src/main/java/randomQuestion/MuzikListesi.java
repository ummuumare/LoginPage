package randomQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MuzikListesi {
    public static void main(String[] args) {

        List<String> calmaListesi = new ArrayList<>();

        calmaListesi.add("Manga Alışırım Gözlerimi Kapamaya");
        calmaListesi.add("Hadise Sıfır Tolerans");
        calmaListesi.add("Nev Zor");
        calmaListesi.add("Sezen Aksu Kutlama");
        calmaListesi.add("İbo Tatlıses DomdomKurşunu");

        System.out.println("Merhaba müzik severler bugünki playlist'imiz tadını çıkarın.");

        System.out.println(calmaListesi);

        sarkiekle(calmaListesi ,"");

        sarkisirala(calmaListesi , "");

        sarkisilme(calmaListesi );

        System.out.println(calmaListesi);

        //listesifirlama(calmaListesi);

    }
    public static void listesifirlama(List<String> sifirlama) {
        System.out.println("Sıfırlamak için 1 , İptal için başka bir tuşa basın (1 Hariç!)");

        Scanner scan = new Scanner(System.in);

        int tus = scan.nextInt();

        if (tus == 1){
            System.out.println(sifirlama);
        }else System.out.println("İptal edildi.");
    }

    public static void sarkisilme(List<String> MuzikSilme) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Silmek istediğiniz şarkı ismi ?");

        //List<String> harfDuzeltme = new ArrayList<>();

        String silinicekSarki = scan.nextLine();

        int indexNo  = MuzikSilme.indexOf(silinicekSarki);

        String str = MuzikSilme.get(indexNo);

        if (silinicekSarki.equalsIgnoreCase(str)){

            MuzikSilme.remove(indexNo);

            System.out.println(silinicekSarki + " Silindi.");

        }else {
            System.out.println("Yanlış Tuşlama");
        }
    }
    public static void sarkiekle(List<String> MuzikListesi , String str) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Eklemek İstediğiniz Şarkı?");

        str = scan.nextLine();

        MuzikListesi.add(str);

        System.out.println(MuzikListesi);

    }
    public static void sarkisirala(List<String> ListeSiralama , String str) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sıralamak istediğiniz yöntemi seçin.");

        str = scan.next();

        if (str.equals("1")){

            Collections.sort(ListeSiralama);

            System.out.println(ListeSiralama);

        } else if (str.equals("2")){


            for (int i = 0; i <ListeSiralama.size()/2+1; i++) {
                System.out.println("Sıralama için A , Çıkmak için B");

                Scanner scan1 = new Scanner(System.in);

                String secim = scan1.next();

                if (secim.equalsIgnoreCase("a")){

                    System.out.println("Değiştirmek istediğiniz şarkının no'su?");

                    int degistirilecekEleman = scan.nextInt();

                    System.out.println("Hangi sıraya almak istersiniz?");

                    int secilenindex = scan.nextInt();

                    String depo = ListeSiralama.get(secilenindex-1);

                    ListeSiralama.set(secilenindex-1 , ListeSiralama.get(degistirilecekEleman-1));

                    ListeSiralama.set(degistirilecekEleman-1 , depo);

                    System.out.println(ListeSiralama);
                } else if (secim.equalsIgnoreCase("b")){
                    System.out.println(ListeSiralama);
                    break;
                }
            }
        }
    }
}

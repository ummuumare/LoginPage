package practice05.inheritance;

import java.time.LocalDate;

public class BankaYonetimUygulamasi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1993,11,28);
        BireyselMusteri bm = new BireyselMusteri(
                "Ali Can",
                1234556677,
                2000,
                "2939495966",
                   dogumTarihi);
        System.out.println(bm.toString());
        bm.paraCekme(2000);

    }
}

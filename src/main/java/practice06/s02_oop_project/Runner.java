package practice06.s02_oop_project;

public class Runner {
    public static void main(String[] args) {
        HayvanatBahcesi hb = new HayvanatBahcesi();

        Aslan simba = new Aslan("Simba", 8, "Aslan");
        Aslan mamba = new Aslan("Mamba", 5, "Aslan");
        hb.hayvanEkle(simba);
        hb.hayvanEkle(mamba);

      //  hb.hayvanListele();
        hb.hayvanTablola();

    }
}

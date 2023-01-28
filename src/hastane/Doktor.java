package hastane;

public class Doktor extends Kisi{

private String unvan="";
private String UzmanlikAlani="";

    public Doktor() {


    }

    public Doktor(String unvan, String uzmanlikAlani) {
        this.unvan = unvan;
        UzmanlikAlani = uzmanlikAlani;
    }

    public Doktor(String adSoyad, String ID, String unvan, String uzmanlikAlani) {
        super(adSoyad, ID);
        this.unvan = unvan;
        UzmanlikAlani = uzmanlikAlani;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "unvan='" + unvan + '\'' +
                ", UzmanlikAlani='" + UzmanlikAlani + '\'' +
                '}';
    }
}

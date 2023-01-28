package hastane;

public class Hasta extends Kisi{
    private String ActualDurum="";
    private String Aciliyet="";

    public Hasta() {

    }

    public Hasta(String adSoyad, String ID, String actualDurum, String aciliyet) {
        super(adSoyad, ID);
        ActualDurum = actualDurum;
        Aciliyet = aciliyet;
    }

    public String getActualDurum() {
        return ActualDurum;
    }

    public void setActualDurum(String actualDurum) {
        ActualDurum = actualDurum;
    }

    public String getAciliyet() {
        return Aciliyet;
    }

    public void setAciliyet(String aciliyet) {
        Aciliyet = aciliyet;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "ActualDurum='" + ActualDurum + '\'' +
                ", Aciliyet='" + Aciliyet + '\'' +
                '}';
    }
}

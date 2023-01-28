package hastane;

public class Kisi {
    private  String adSoyad="";
    private  String ID="";

    public Kisi() {

    }

    public Kisi(String adSoyad, String ID) {
        this.adSoyad = adSoyad;
        this.ID = ID;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}

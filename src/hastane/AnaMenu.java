package hastane;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface {

static Scanner scan=new Scanner(System.in);

    public static void giris() {
        AnaMenu obj=new AnaMenu();
        System.out.println("Hastane Yonetimi");
        System.out.println("Lutfen seciminizi yapiniz");
        System.out.println("1Hasta islemleri  2DoktorIslemleri @Cikis");

        String scm=scan.next().toUpperCase();

        switch(scm){
            case "1":
               obj.doktorIslemleri();
               break;
            case "2":
                obj.hastaIslemleri();
                break;
            case "3":
                obj.cikis();
                break;
                default:
                    System.out.println("Lutfen gecerli bir secim yapiniz");
        }

    }

    @Override
    public void doktorIslemleri() {
        VeriBankasi.Islemler(1);

    }

    @Override
    public void hastaIslemleri() {
        VeriBankasi.Islemler(2);
    }

    @Override
    public void cikis() {
        VeriBankasi.Islemler(3);
    }
}

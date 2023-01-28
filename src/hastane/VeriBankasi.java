package hastane;

import java.util.Scanner;

import static hastane.AnaMenu.scan;

public class VeriBankasi implements VeriBankasiInterface{
    static Scanner scanner = new Scanner(System.in);
    static int secim=0;


    public static void Islemler(int i) {
        secim=i;
        VeriBankasi obj= new VeriBankasi();

        System.out.println("Lutfen secim yapiniz...");
        System.out.println("1arama 2ekleme 3listeleme 4silme 5AnaMenu 6Cikis");

         int scm=scan.nextInt();

        switch (scm){

            case 1:
                obj.arama();
                Islemler(secim);
                break;
            case 2:
                obj.ekleme();
                Islemler(secim);
                break;
            case 3:
                obj.listeleme();
                Islemler(secim);
                break;
            case 4:
                obj.silme();
                Islemler(secim);
                break;
            case 5:
                obj.anaMenu();
                Islemler(secim);
                break;
            case 6:
                obj.cikis();
                Islemler(secim);
                break;


         }





    }

    @Override
    public void arama() {

    }

    @Override
    public void ekleme() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}


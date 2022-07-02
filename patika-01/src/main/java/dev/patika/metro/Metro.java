package dev.patika.metro;

import java.util.Scanner;

public class Metro {
    private static Scanner scanner = new Scanner(System.in);
    private static double bakiye;

    public static void main(String[] args) {
        int secim = 0;
        do {
            System.out.println("1- Kart bakiyesi göster");
            System.out.println("2- Karta para yükle");
            System.out.println("3- Metroya bin");
            System.out.println("4- Sistemden çıkış");

            System.out.println("Seçim : ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeyiGoster();
                    break;
                case 2:
                    kartaParaYukle();
                    break;
                case 3:
                    metroyaBin();
                    break;
                case 4:
                default:
                    sistemCikis();
                    break;
            }

        } while (secim != 4);

    }

    private static void sistemCikis() {
        System.out.println("Güle güle...");
        System.exit(0);
    }

    private static void metroyaBin() {

        System.out.println("Abone durumunu seçiniz: \n\t1- Tam bilet \n\t2-İndirimli bilet");
        int aboneSecim = scanner.nextInt();

        if (aboneSecim == 1) {
            if (bakiye > 6.5) {
                bakiye -= 6.5;
            } else {
                System.out.println("Yetersiz bakiye.");
                bakiyeyiGoster();
                System.out.println("Tam bilet! Metroya geçiniz!");
            }
        } else if (aboneSecim == 2) {
            if (bakiye > 4.2) {
                bakiye -= 4.2;
            } else {
                System.out.println("Yetersiz bakiye.");
                bakiyeyiGoster();
                System.out.println("İndirimli bilet! Metroya geçiniz!");
            }
        } else {
            System.out.println("Yanlış seçim!");
            metroyaBin();
        }
        bakiyeyiGoster();

    }

    private static void kartaParaYukle() {
        System.out.println("Para miktarını giriniz: ");
        double yuklenecekBakiye = scanner.nextDouble();
        bakiye += yuklenecekBakiye;
        bakiyeyiGoster();
    }

    private static void bakiyeyiGoster() {
        System.out.println("Kartınızda yer alan bakiyeniz : " + bakiye + " TL.");
    }
}

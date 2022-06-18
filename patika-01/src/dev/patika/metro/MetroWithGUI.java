package dev.patika.metro;

import javax.swing.*;

public class MetroWithGUI {
    private static double bakiye;

    public static void main(String[] args) {
        int secim = 0;
        do {
            String input = JOptionPane.showInputDialog("1- Kart bakiyesi göster\n"
            + "2- Karta para yükle\n"
            + "3- Metroya bin\n"
            + "4- Sistemden çıkış");

            switch (Integer.valueOf(input)) {
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
        JOptionPane.showMessageDialog(null, "Güle güle...");
        System.exit(0);
    }

    private static void metroyaBin() {

        String aboneDurum = JOptionPane.showInputDialog("Abone durumunu seçiniz: \n\t1- Tam bilet \n\t2-İndirimli bilet");

        if (Integer.valueOf(aboneDurum) == 1) {
            if (bakiye > 6.5) {
                bakiye -= 6.5;
                JOptionPane.showMessageDialog(null, "Tam bilet! Metroya geçiniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Yetersiz bakiye.");
                bakiyeyiGoster();
            }
        } else if (Integer.valueOf(aboneDurum) == 2) {
            if (bakiye > 4.2) {
                bakiye -= 4.2;
                JOptionPane.showMessageDialog(null, "İndirimli bilet! Metroya geçiniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Yetersiz bakiye.");
                bakiyeyiGoster();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Yanlış seçim!");
            metroyaBin();
        }
        bakiyeyiGoster();

    }

    private static void kartaParaYukle() {
        String yuklenecekBakiye = JOptionPane.showInputDialog("Para miktarını giriniz: ");
        bakiye += Double.valueOf(yuklenecekBakiye);
        bakiyeyiGoster();
    }

    private static void bakiyeyiGoster() {
        JOptionPane.showMessageDialog(null, "Kartınızda yer alan bakiyeniz : " + bakiye + " TL.");
    }
}

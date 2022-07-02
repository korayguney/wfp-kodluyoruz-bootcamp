package dev.patika.questions;

public class TomJerry {
    public static void main(String[] args) {
        String[] sa = {"tom", "jerry"};
        outer:
        for (int i = 0; i < 3; i++) {
            for (String s : sa) {
                System.out.println(i + " " + s);
                if (i == 1) break outer;
            }
        }
    }
}

// 0 tom 0 jerry 1 tom 1 jerry   (1)
// 0 tom 0 jerry 2 tom 2 jerry   (2)
// 0 tom 0 jerry 1 tom 2 tom 2 jerry   (3)
// 0 tom 0 jerry 1 tom 1 jerry 2 tom 2 jerry   (4)

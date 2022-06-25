package dev.patika.questions;

public class FeedingSchedule {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch (y) {
                default:
                case 0:
                    x -= 1;
                    break;
                case 1:
                    x += 5;
            }
        }
        System.out.println(x);
    }
}

//   4
//   5
//   6
//   7
//   13
//   The code will not compile because of line 7.

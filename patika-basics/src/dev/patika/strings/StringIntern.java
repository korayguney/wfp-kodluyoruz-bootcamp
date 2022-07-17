package dev.patika.strings;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = "patika";
        String str2 = "patika";

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        System.out.println("--------------------");

        Integer year = 2022;
        String str3 = year.toString().intern();
        String str4 = "2022";

        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);

    }
}

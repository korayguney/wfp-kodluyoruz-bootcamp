package dev.patika.strings;

public class StringEquals {

    public static void main(String[] args) {
        // String literals (String common pool)
        String str1 = "patika";
        String str2 = "patika";

        if(str1 == str2) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        if(str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        System.out.println("str1 :" + System.identityHashCode(str1));
        System.out.println("str2 :" + System.identityHashCode(str2));

        System.out.println("-------------------------");
        // String objects
        String str3 = new String("patika");
        String str4 = new String("patika");

        if(str3 == str4) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        if(str3.equals(str4)) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        System.out.println("str3 :" + System.identityHashCode(str3));
        System.out.println("str4 :" + System.identityHashCode(str4));

    }





}

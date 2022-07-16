package dev.patika.questions;

public class Theory {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
    }
}

 //      Which are true? (Choose all that apply.)
 //      A. Compilation fails
 //      B. The first line of output is abc abc true
 //      C. The first line of output is abc abc false
 //      D. The first line of output is abcd abc false
 //      E. The second line of output is abcd abc false
 //      F. The second line of output is abcd abcd true
 //      G. The second line of output is abcd abcd false

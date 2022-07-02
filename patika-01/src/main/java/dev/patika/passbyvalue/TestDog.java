package dev.patika.passbyvalue;

public class TestDog {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        foo(aDog);
        aDog.getName().equals("Max"); // true
        aDog.getName().equals("Fifi"); // false
        System.out.println(aDog == oldDog); // true
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }
}

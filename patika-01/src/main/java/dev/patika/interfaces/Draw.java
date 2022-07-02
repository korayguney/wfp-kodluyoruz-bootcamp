package dev.patika.interfaces;

public class Draw implements IDraw{

    public static void main(String[] args) {
        IDraw.staticFoo();
        new Draw().foo();
    }

    @Override
    public void foo() {

    }
}

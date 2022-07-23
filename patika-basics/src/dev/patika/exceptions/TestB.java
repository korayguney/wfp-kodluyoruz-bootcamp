package dev.patika.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestB extends TestA {

    @Override
    public void methodA() throws IllegalArgumentException {
        super.methodA();
    }

    @Override
    public void methodB() throws FileNotFoundException {
        super.methodB();
    }
}

package dev.patika.questions;

public class TestMain {
    public static void main(String[] args) {

        TestSuper testclass = new TestSub();

        if(testclass instanceof TestSuper){
            System.out.println("testclass instanceof TestSuper"); // 1
        } else {
            System.out.println("False-01"); // 2
        }

        if(testclass.getClass() == TestSuper.class){
            System.out.println("testclass.getClass() == TestSuper.class");  // 3
        } else {
            System.out.println("False-02"); // 4
        }
    }
}

class TestSub extends TestSuper{
}

class TestSuper {
}

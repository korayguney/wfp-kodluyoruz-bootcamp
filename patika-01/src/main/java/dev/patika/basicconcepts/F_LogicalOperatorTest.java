package dev.patika.basicconcepts;

import java.util.Objects;

public class F_LogicalOperatorTest {
    public static void main(String[] args) {
        int x = 0;

        // (&&) conditional AND - (&) boolean logical AND
        // short circuit
        // if (true || (1 == ++x)) {
        //     System.out.println("Inside in if...");
        // }

        // System.out.println(x); // ???


        if ((x != 0) && (1 / x > 1)) {
            System.out.println("Inside of second if");
        }

        String test = null;

        if (Objects.nonNull(test) && test.toUpperCase().length() > 5) {
            test = test.toUpperCase();
        }
    }
}

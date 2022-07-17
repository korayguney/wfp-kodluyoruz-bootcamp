package dev.patika.strings;

public class StringAlternatives {

    public static void main(String[] args) {

        // immutable
        String str = "Koray";
        System.out.println("String memory id : " + str.hashCode());
        str += " Güney";
        System.out.println("String memory id : " + str.hashCode());
        System.out.println("String : " + str);

        System.out.println("------------------------");

        // mutable (değiştirilebilir)
        // asyncronized (non-thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Koray");
        System.out.println("String memory id : " + stringBuilder.hashCode());
        stringBuilder.append(" Güney");
        System.out.println("String memory id : " + stringBuilder.hashCode());
        System.out.println("String : " + stringBuilder);

        // mutable (değiştirilebilir)
        // syncronized (thread-safe)
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Koray");
        System.out.println("String memory id : " + stringBuffer.hashCode());
        stringBuffer.append(" Güney");
        System.out.println("String memory id : " + stringBuffer.hashCode());
        System.out.println("String : " + stringBuffer);


    }
}

package dev.patika.basicconcepts;

public class E_SwitchTest {
    public static void main(String[] args) {

        int dayOfWeek = 1;
        String preText = "Today is ";

        switch (dayOfWeek) {
            case 1:
                System.out.println(preText + " Monday!");
                break;
            case 2:
                System.out.println(preText + " Tuesday!");
                break;
            case 3:
                System.out.println(preText + " Wednesday!");
                break;
            case 4:
                System.out.println(preText + " Thursday!");
                break;
            case 5:
                System.out.println(preText + " Friday!");
                break;
            case 6:
                System.out.println(preText + " Saturday!");
                break;
            case 7:
                System.out.println(preText + " Sunday!");
                break;
            default:
                System.out.println("No day :)");
                break;
        }
    }


    public String exampleOfSwitch(String animal) {
        String result;
        final String dog = "DOG";

        switch (animal) {
            case dog:
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }

}

package me.afibarra;

/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {
        System.out.println(reverseString("Armando Flores Ibarra"));
    }

    private static String reverseString(String strToReverse) {
        int strToReverseLength = strToReverse.length();
        char[] reversedArray = new char[strToReverseLength];

        for (int strChar : strToReverse.chars().toArray()) {
            reversedArray[strToReverseLength - 1] = (char) strChar;
            strToReverseLength--;
        }

        return new String(reversedArray);
    }
}

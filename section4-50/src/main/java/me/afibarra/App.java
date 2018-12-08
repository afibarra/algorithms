package me.afibarra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {
        String[] userArray = {"a", "b", "c", "x"};
        String[] internalStorageArray = {"z", "y", "r"};

        System.out.println(containsCommonItem2(userArray, internalStorageArray));
    }


//    private static boolean containsCommonItem(char[] c1, char[] c2) {
//        for (int i  = 0; i < c1.length; i++) {
//            for (int j = 0; j < c2.length; j++) {
//                if (c1[i] == c2[j])
//                    return true;
//            }
//        }
//
//        O(n^2)
//        return false;
//    }

    private static boolean containsCommonItem2(String[] userArray, String[] internalStorageArray) {
        // Convert first array into a Hash Table
        // Look trough second array and check if exists in the Hash Table
        // O(a + b)

        Map<String, Boolean> valuesToSearchOn = Arrays.stream(userArray).collect(Collectors.toMap(s -> s, s -> true));
        return Arrays.stream(internalStorageArray).anyMatch(inputString -> valuesToSearchOn.containsKey(inputString));
    }
}

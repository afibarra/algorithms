package me.afibarra;

import java.util.HashSet;
import java.util.Set;

/**
 * Simple main application
 */
public class App {

    //Google Question
    //Given an array = [2,5,1,2,3,5,1,2,4]:
    //It should return 2

    //Given an array = [2,1,1,2,3,5,1,2,4]:
    //It should return 1

    //Given an array = [2,3,4,5]:
    //It should return undefined

    public static void main(String[] args) {
        System.out.println(firstRecurringCharacter(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4}));
        System.out.println(firstRecurringCharacter(new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4}));
        System.out.println(firstRecurringCharacter(new int[]{2, 3, 4, 5}));
    }

    private static int firstRecurringCharacter(int[] input) {
        Set<Integer> inputSet = new HashSet<>(input.length);

        for (int number : input) {
            if (!inputSet.remove(number)) {
                inputSet.add(number);
            } else {
                return number;
            }
        }

        // Undefined
        return -1;
    }
}

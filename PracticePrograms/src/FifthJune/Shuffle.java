package FifthJune;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    public static void shuffle(int numbers[]) {
        for (int index = numbers.length - 1; index >= 1; index--) {
            Random rand = new Random();
            int result = rand.nextInt(index + 1);
            swap_elements(numbers, index, result);
        }
    }
    private static void swap_elements(int[] numbers, int index, int result) {
        int temp = numbers[index];
        numbers[index] = numbers[result];
        numbers[result] = temp;
    }
    public static void main(String[] args) {
        {
            int[] numbers = {1, 2, 3, 4, 5, 6};
            System.out.println("Original Array: " + Arrays.toString(numbers));
            shuffle(numbers);
            System.out.println("Shuffle Array: " + Arrays.toString(numbers));
        }
    }
}
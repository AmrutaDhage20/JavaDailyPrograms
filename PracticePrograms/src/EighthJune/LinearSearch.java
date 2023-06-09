package EighthJune;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int target = 1;
        int index = linearSearch(numbers, target);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
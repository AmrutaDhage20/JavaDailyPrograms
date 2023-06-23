package EighthJune;

import java.util.Arrays;

public class ClockwiseRotationOfArray {
    public static void leftRotate(int arrayToBeRotated[], int numberOfPositionsToRotate, int SizeOfTheArray) {
        for (int index = 0; index < numberOfPositionsToRotate; index++)
            leftRotatebyOne(arrayToBeRotated, SizeOfTheArray);
    }
    public static void leftRotatebyOne(int arrayToBeRotated[], int SizeOfTheArray) {
        int index, temporary;
        temporary = arrayToBeRotated[0];
        for (index = 0; index < SizeOfTheArray - 1; index++) arrayToBeRotated[index] = arrayToBeRotated[index + 1];
        arrayToBeRotated[SizeOfTheArray - 1] = temporary;
    }
    public static void printArray(int arrayToBeRotated[], int SizeOfTheArray) {
        for (int index = 0; index < SizeOfTheArray; index++) System.out.print(arrayToBeRotated[index] + " ");
    }
    public static void main(String[] args) {
        int arrayToBeRotated[] = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arrayToBeRotated));
        leftRotate(arrayToBeRotated, 2, 5);
        System.out.println("Rotated array: ");
        printArray(arrayToBeRotated, 5);
    }
}
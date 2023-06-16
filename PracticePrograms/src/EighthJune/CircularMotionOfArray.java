package EighthJune;

public class CircularMotionOfArray {

    static void leftRotate(int arrayToBeRotated[], int numberOfPositionsToRotate, int SizeOfTheArray) {
        for (int index = 0; index < numberOfPositionsToRotate; index++)
            leftRotatebyOne(arrayToBeRotated, SizeOfTheArray);
    }
    static void leftRotatebyOne(int arrayToBeRotated[], int SizeOfTheArray) {
        int index, temporary;
        temporary = arrayToBeRotated[0];
        for (index = 0; index < SizeOfTheArray - 1; index++) arrayToBeRotated[index] = arrayToBeRotated[index + 1];
        arrayToBeRotated[SizeOfTheArray - 1] = temporary;
    }
    static void printArray(int arrayToBeRotated[], int SizeOfTheArray) {
        for (int index = 0; index < SizeOfTheArray; index++) System.out.print(arrayToBeRotated[index] + " ");
    }
    public static void main(String[] args) {
        // RotateArray rotate = new RotateArray();
        int arrayToBeRotated[] = {1, 2, 3, 4, 5};
        leftRotate(arrayToBeRotated, 2, 5);
        printArray(arrayToBeRotated, 5);
    }
}
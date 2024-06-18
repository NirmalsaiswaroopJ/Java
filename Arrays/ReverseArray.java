import java.util.*;
public class Main {
    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] temp = new int[n]; 
        for (int i = n - 1, j = 0; i >= 0 && j < n; i--, j++) {
            temp[j] = array[i];
        }
        return temp; 
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}

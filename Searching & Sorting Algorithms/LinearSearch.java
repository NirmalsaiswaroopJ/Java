import java.util.Scanner;
public class Main {
    private static int LinearSearch(int[] array, int key) {
        int size = array.length;
        int flag = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                flag = i;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the key to be searched:");
        int key = scanner.nextInt();
        int result = LinearSearch(array, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
        scanner.close();
    }
}

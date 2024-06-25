import java.util.*;
public class Main {
    public static int LongContSubArrAbsDiff(int[] array, int limit) {
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int[] subarray = Arrays.copyOfRange(array, i, j + 1);
                int min = findMin(subarray);
                int max = findMax(subarray);
                if (Math.abs(max - min) <= limit) {
                    maxLength = Math.max(maxLength, subarray.length);
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();
        int ans = LongContSubArrAbsDiff(nums, limit);
        System.out.println("Minimum Difference: " + ans);
    }
}

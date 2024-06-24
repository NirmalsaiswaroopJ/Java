import java.util.Scanner;
class Main {
    public static int MaximumProductSubarray(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }
        return maxProduct;
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
        int maxSubarrayProduct = MaximumProductSubarray(nums);
        System.out.println("Maximum subarray product: " + maxSubarrayProduct);
    }
}

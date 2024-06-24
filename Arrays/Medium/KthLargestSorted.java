import java.util.*;
public class KthLargestSorted{
    public static int KthLargestFunc(int[] array, int k){
        Arrays.sort(array);
        int[] temp = new int[array.length];
        for(int i = array.length-1, j = 0; i>= 0 && j< array.length; i--, j++){
            temp[j] = array[i];
        }
        return temp[k-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the nth value to find nth biggest number in sorted order: ");
        int k = sc.nextInt();
        int ans = KthLargestFunc(arr,k);
        System.out.println("Kth Largest Element: "+ ans);
    }
}
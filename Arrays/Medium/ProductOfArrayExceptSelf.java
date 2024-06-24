import java.util.Scanner;
class Main{
    public static int[] ProductOfArrayExceptSelf(int[] array){
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        int[] res = new int[array.length];
        left[0] = 1;
        right[array.length - 1] = 1;
        for(int i = 1; i< array.length; i++){
            left[i] = left[i-1] * array[i-1];
        }
        for(int j = array.length-2; j>-1; j--){
            right[j] = right[j+1] * array[j+1];
        }
        for(int k = 0; k<array.length; k++){
            res[k] = left[k] * right[k];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0;i<size; i++){
            array[i] = sc.nextInt();
        }
        int[] ans = ProductOfArrayExceptSelf(array);
        System.out.print("Required answer: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
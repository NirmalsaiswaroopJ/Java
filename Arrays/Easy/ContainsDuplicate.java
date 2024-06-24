import java.util.*;
public class Main{
    private static boolean ContainsDuplicate (int[] array){
        Set<Integer> Set = new HashSet<>();
        for (int element : array) {
            if (!Set.add(element)){
                return true;
            }
        }
         
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        if(ContainsDuplicate(nums)){
            System.out.println("Array contains duplicate.");
        } else{
            System.out.println("Array does not contain duplicate. ");
        }
    }
}

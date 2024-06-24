import java.util.*;
public class MissingRepeated{
    public int[] MissingRepeatFunc(int[] array){
        int repeated = -1;
        int missing = -1;
        HashSet<Integer> seen = new HashSet<>();
        Arrays.sort(array);
        for(int i = 0; i< array.length; i++){
            if(seen.contains(array[i])){
                repeated = array[i];
            } else{
                seen.add(array[i]);
            }
        }
        for(int i = 1; i<= array.length; i++){
            if(!seen.contains(i)){
                missing = i;
                break;
            }
        }
        int[] res = {repeated, missing};
        return res;
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
        int[] ans = new MissingRepeated().MissingRepeatFunc(arr);
        System.out.println("Repeated value: "+ans[0] + " Missing value: "+ans[1]);
    }
}
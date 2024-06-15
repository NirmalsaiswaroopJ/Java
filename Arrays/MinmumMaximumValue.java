import java.util.*;
public class Main{
    public int MinimumValue(int[] arr){
        int minvalue = Integer.MAX_VALUE;
        for(int num: arr){
            if(num < minvalue){
                minvalue = num;
            }
        }
        return minvalue;
    }
    public int MaximumValue(int[] arr){
        int maxvalue = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > maxvalue){
                maxvalue = num;
            }
        }
        return maxvalue;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i< size; i++){
            array[i] = sc.nextInt();
        }
        Main obj = new Main();
        int ans1 = obj.MinimumValue(array);
        int ans2 = obj.MaximumValue(array);
        System.out.println("Minimum value: "+ans1+" Maximum value: "+ans2);
    }
}
public class Main{
    public static int longestSubarraywithSumbyK(int[] array, int k){
        int maxval = 0;
        int n = array.length;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = 1; j<n; j++){
                sum = sum + array[j];
                if(sum % k == 0){
                    maxval = Math.max(sum, j-i+1);
                }
            }
        }
        return maxval;
    }
    public static void main(String[] args){
        int arr[] = { 2, 7, 6, 1, 4, 5 };
        int k = 3;
 
        System.out.println("Length = "
                       + longestSubarraywithSumbyK(arr, k));
    }
}

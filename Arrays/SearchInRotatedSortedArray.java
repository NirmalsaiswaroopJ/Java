public class SearchInRotatedSortedArray{
    private static int SearchFunction(int[] arr, int target){
        int low = 0; int high = arr.length -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if (target < arr[mid] && target>= arr[low]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            } else{
                if(target >= arr[mid] && target < arr[high]){
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int ans = SearchFunction(nums1, target1);
        System.out.println(ans);
    }
}
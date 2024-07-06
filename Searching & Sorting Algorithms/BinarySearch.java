public class Main {
    public static int BinarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;  
            } else if (array[mid] < key) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 12;
        int result = BinarySearch(array, key);
        if (result != -1) {
            System.out.println("Key " + key + " found at index " + result);
        } else {
            System.out.println("Key " + key + " not found in the array");
        }
    }
}

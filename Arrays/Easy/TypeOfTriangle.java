import java.util.Scanner;
public class Main{
    public static String TriangleType(int[] nums){
        if((nums[0] == nums[1]) && (nums[1] == nums[2])){
            return "equilateral";
        }
        if((nums[0] != nums[1]) && (nums[0] != nums[2]) && (nums[1] != nums[2])){
            if(nums[0] + nums[1] > nums[2]){
                if(nums[1] + nums[2] > nums[0]){
                    if(nums[0] + nums[2] > nums[1]){
                        return "scalene";
                    }
                }
            }
        }
        if(nums[0]+nums[1] > nums[2]){
            if(nums[0]+nums[2]>nums[1]){
                if(nums[1]+nums[2]>nums[0]){
                    if((nums[0] == nums[1]) || (nums[0] == nums[2]) || (nums[1] == nums[2])){
                        return "isosceles";
                    }
                }
            }
        }
        return "none";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides in the triangle: ");
        int[] triangle = new int[3];
        for(int i = 0; i < 3; i++){
            triangle[i] = sc.nextInt();
        }
        String ans = TriangleType(triangle);
        System.out.println("Type of Triangle: "+ ans);
    }
}
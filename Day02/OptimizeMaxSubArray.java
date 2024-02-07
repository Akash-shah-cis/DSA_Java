package Day02;

//Now we use Kadane's Algorithim to optimize the approach

public class OptimizeMaxSubArray {
    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int TotalSum = nums[0];
        
        for(int i =1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            TotalSum  = Math.max(TotalSum, currSum);
           
        }

        return TotalSum;
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,12,-1};
        System.out.println("result" + maxSubArray(arr));
    }
}

package Day02;

// The initial code had a time complexity of O(n^3), which is not optimal. We introduced a more efficient method using a Prefix Array to calculate the sum of an array. 

public class MaxSumSubArray2 {
    public static void main(String[] args) {
        System.out.println("Print Subarray");
        int arr[] =  {1,2,4,8,6,9,5};
        int MinSum = Integer.MAX_VALUE;
        int MaxSum = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int k =1;k<arr.length;k++){
            prefix[k] = prefix[k-1]+arr[k];
        }
        
        for(int i =0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                
                //taking help of prefix Array
                int end = j;
                //condition because at start = 0, we can't 0-1, which is not in array 
                sum = i==0? prefix[end] :  prefix[end] - prefix[start-1];
                
                MaxSum = Math.max(MaxSum,sum);
                MinSum = Math.min(MinSum,sum);
                System.out.println("");
                System.out.println("Subarray sum = > "+ sum);
                sum =0;
            }
        }
        System.out.println("Max Sum => "+ MaxSum);
        System.out.println("Min Sum => "+ MinSum);
    }    
}

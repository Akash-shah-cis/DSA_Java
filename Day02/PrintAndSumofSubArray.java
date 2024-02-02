
package Day02;

/**
 * PrintAndSumofSubArray
 */
public class PrintAndSumofSubArray {

    public static void main(String[] args) {
        System.out.println("Print Subarray");
        int arr[] =  {1,2,4,8,6,9,5};
        int MinSum = Integer.MAX_VALUE;
        int MaxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    sum += arr[k];
                    System.out.print("("+arr[k]+")");
                }
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
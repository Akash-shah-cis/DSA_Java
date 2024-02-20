package ImpQuestions;

public class TrappedWater {
    
    public static int trap(int[] height) {
        int len  = height.length;
        int leftMax[] = new int[len];
        int rightMax[] = new int[len];

       //left max
       int leftMaxBar = Integer.MIN_VALUE;
       for(int i=0;i<len;i++){
           leftMaxBar = Math.max(leftMaxBar,height[i]);
           leftMax[i] = leftMaxBar;
       }

       //rightmax
       int rightMaxBar= Integer.MIN_VALUE;
       for(int i=len-1;i>=0;i--){
           rightMaxBar = Math.max(rightMaxBar,height[i]);
           rightMax[i] = rightMaxBar;
       }

       //Get trapped water
       int TotalTrappedWater = 0;
        for(int i=0;i<len;i++){
            int getwater = Math.min(leftMax[i],rightMax[i]);
            TotalTrappedWater += Math.abs(height[i] - getwater);
        }
         return TotalTrappedWater;
    }

    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater =  trap(height);
        System.out.println(trappedWater);
    }
}

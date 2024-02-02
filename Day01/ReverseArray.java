package Day01;

public class ReverseArray {
    public static void main(String[] args) {
        
        System.out.println("Reverse An array");
        int arr[] = {1,2,3,3,21,22,2,5,6,7};
        int left =0;
        int right = arr.length-1;
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]);
            i++;
        }
    }
}

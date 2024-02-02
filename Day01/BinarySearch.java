package Day01;

// Notes : 
// Binary Search
// 1. Binary search is like searching for a word in a dictionary.
// 2. For example, let's assume this is your dictionary: {apple, mango, grapes, lychee}.
// 3. Now, if you want to search for "mango", you wouldn't perform a linear search, which means searching from the start. Instead, since you know that "mango" starts with 'm', you would start searching directly from the 'm' section in the dictionary.
// 4. The same technique is used in Binary Search.
// 5. Note: Binary search always applies to a sorted array.

// Pseudocode:
// If the array is sorted in ascending order, the following will work; otherwise, vice versa:
// 1. Halve the array.
// 2. Define three variables: start, mid, end.
// 3. Check the search element against mid.
// 4. If (ele > mid) -> This means the element you want to search is on the right side.
// 5. Else if (ele < mid) -> This means the element is on the left.
// 6. Else (ele == mid), return mid.
// 7. If the element is on the right side, set mid as your start element, halve the array again, define a new mid, and repeat the process.
// 8. Vice versa if the element is on the left side.


public class BinarySearch {
    public static void main(String[] args) {
        
        System.out.println("Binary Search");
        int element =  4;
        int arr[] = {1,2,3,4,5,6,7};
        int start =0;
        int end = arr.length-1;
        
        while(start <= end){
           int  mid = (start+end)/2;
            
            if(element==arr[mid]){
            System.out.print("Element is found"+ mid);
            return;
            }
            else if(element>arr[mid]){
                start = mid+1;
            }
            else if(element<arr[mid]){
                end = mid-1;
            }
        }
         System.out.print("Element not found");
    }
}

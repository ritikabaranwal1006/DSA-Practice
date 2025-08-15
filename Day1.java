/* 
Sort an Array of 0s, 1s, and 2s

You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

Input:
An integer array arr of size n where each element is either 0, 1, or 2.
Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]

Output:
The sorted array, arranged in increasing order of 0s, 1s, and 2s.
Example: [0, 0, 0, 1, 1, 1, 2, 2]
*/
import java.util.Arrays;

public class Day1 {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {           
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }   
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Original array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }   
    
}

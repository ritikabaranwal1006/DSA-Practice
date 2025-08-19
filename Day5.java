import java.util.*;

public class Day5 {
    
  
    static List<Integer> findLeaders(int arr[], int n) {
        List<Integer> result = new ArrayList<>();

      
        if (n == 0) return result;

        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }

       
        List<Integer> leaders = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            leaders.add(result.get(i));
        }

        return leaders;
    }

    public static void main(String[] args) {
 
        int arr1[] = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders: " + findLeaders(arr1, arr1.length));

        int arr2[] = {10, 9, 8, 7};
        System.out.println("Leaders: " + findLeaders(arr2, arr2.length));

        int arr3[] = {1, 2, 3, 4};
        System.out.println("Leaders: " + findLeaders(arr3, arr3.length));

        int arr4[] = {5, 5, 5, 5};
        System.out.println("Leaders: " + findLeaders(arr4, arr4.length));

        int arr5[] = {42};
        System.out.println("Leaders: " + findLeaders(arr5, arr5.length));

        int arr6[] = {};
        System.out.println("Leaders: " + findLeaders(arr6, arr6.length));
    }
}

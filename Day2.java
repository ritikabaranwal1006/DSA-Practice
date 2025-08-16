public class Day2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; 
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int totalSum = n * (n + 1) / 2;
        return totalSum - sum;
    }
}

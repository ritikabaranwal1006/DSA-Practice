public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 2};
        int[] arr2 = {3, 1, 3, 4, 2};
        int[] arr3 = {1, 1};
        int[] arr4 = {1, 4, 4, 2, 3};
        System.out.println(findDuplicate(arr1));
        System.out.println(findDuplicate(arr2));
        System.out.println(findDuplicate(arr3));
        System.out.println(findDuplicate(arr4));
    }
}

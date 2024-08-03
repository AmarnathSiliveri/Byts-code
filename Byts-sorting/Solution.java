import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Return an array indicating no solution found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
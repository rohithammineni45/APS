import java.util.*;

class Solution {

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = len - 1;
        int res[] = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            int headValue = nums[head];
            int tailValue = nums[tail];

            if (headValue > tailValue) {
                res[i] = headValue;
                head++;
            } else {
                res[i] = tailValue;
                tail--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] ans = obj.sortedSquares(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

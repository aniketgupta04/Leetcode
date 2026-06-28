import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k %= n;

        int[] temp = Arrays.copyOf(nums, n);

        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = temp[i];
        }
    }
}
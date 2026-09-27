class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] sq = new int[n];
        int[] res = new int[n];
        int in = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                in++;
            }
            sq[i] = nums[i] * nums[i];
        }

        rev(sq, 0, in - 1);

        

        int left = 0;
        int right = in;
        int id = 0;

        while (left < in && right < n) {

            if (sq[left] <= sq[right]) {
                res[id] = sq[left];
                left++;
                id++;
                
            } else {
                res[id] = sq[right];
                id++;
                right++;
            }

        }

        while (right < n) {
            res[id] = sq[right];
            id++;
            right++;
        }
        while (left < in) {
            res[id] = sq[left];
            id++;
            left++;
        }

        return res;

    }

    public int[] rev(int[] sq, int i, int in) {

        while (i < in) {
            int temp = sq[i];
            sq[i] = sq[in];
            sq[in] = temp;
            i++;
            in--;
        }
        return sq;
    }
}
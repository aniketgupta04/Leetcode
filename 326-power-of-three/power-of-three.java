class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false; // important edge case
        return helper(n, 0);
    }

    private boolean helper(int n, int pow) {

        if (Math.pow(3, pow) == n) {
            return true;
        }

        if (Math.pow(3, pow) > n) {
            return false;
        }

        return helper(n, pow + 1);
    }
}
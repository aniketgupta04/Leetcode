class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false; 
        return helper(n, 0);
    }

    private boolean helper(int n, int pow) {

        if (Math.pow(4, pow) == n) {
            return true;
        }

    
        if (Math.pow(4, pow) > n) {
            return false;
        }

        return helper(n, pow + 1);
    }
}
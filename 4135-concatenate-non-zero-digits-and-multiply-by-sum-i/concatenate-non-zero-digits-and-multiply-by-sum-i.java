class Solution {
    public long sumAndMultiply(int n) {

        long concat = 0;
        long place = 1;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit != 0) {
                concat += (long) digit * place;
                place *= 10;
                sum += digit;
            }

            n /= 10;
        }

        return concat * sum;
    }
}
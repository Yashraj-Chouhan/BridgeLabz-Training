class Solution {
    public int reverse(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;

            // Overflow check
            if (reversedNum > Integer.MAX_VALUE / 10 ||
                reversedNum < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}

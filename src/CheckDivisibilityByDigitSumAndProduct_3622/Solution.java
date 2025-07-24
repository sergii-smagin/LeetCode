package CheckDivisibilityByDigitSumAndProduct_3622;

public class Solution {
    public boolean checkDivisibility(int n) {
        if (n == 0) return false;

        int sum = 0;
        int product = 1;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        int total = sum + product;
        if (total == 0) {
            return false;
        } else {
            return n % total == 0;
        }
    }
}

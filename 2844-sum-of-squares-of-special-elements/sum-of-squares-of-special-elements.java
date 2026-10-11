class Solution {
    public int sumOfSquares(int[] nu) {
        int n = nu.length, su = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int v = nu[i - 1];
                su += v * v;
            }
        }
        return su;
    }
}
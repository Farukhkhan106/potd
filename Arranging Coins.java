class Solution {
    public int arrangeCoins(int n) {
        int k = (int) (Math.sqrt(0.25 + 2 * (long) n) - 0.5);
        return k;
    }
}

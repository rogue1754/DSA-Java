class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long sharingCount = 0;
        long totalAware = 1;
        for (int i = 2; i <= n; i++) {
            long newSharers = 0;
            if (i - delay >= 1) {
                newSharers = dp[i - delay];
            }
            long oldSharers = 0;
            if (i - forget >= 1) {
                oldSharers = dp[i - forget];
            }
            sharingCount = (sharingCount + newSharers - oldSharers + MOD) % MOD;
            dp[i] = sharingCount;
            totalAware = (totalAware + dp[i] - oldSharers + MOD) % MOD;
        }

        return (int) totalAware;
    }
}
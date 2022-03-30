class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // –‡? a
        for (int i = 0; i < n; ++i) {
            // •Û?˜aãˆêŸ–‡?“IŒ³‘f•s‘Š“™
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // g—p‘ow?–‡? b ˜a c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // ”@‰Ê˜a? target ’¼Ú•Ô‰ñ“šˆÄ
                if (sum == target) {
                    return target;
                }
                // ª˜·?“I???—ˆXV“šˆÄ
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // ”@‰Ê˜a‘å˜° targetCˆÚ? c ??“Iw?
                    int k0 = k - 1;
                    // ˆÚ?“‰ºˆê˜¢•s‘Š“™“IŒ³‘f
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // ”@‰Ê˜a¬˜° targetCˆÚ? b ??“Iw?
                    int j0 = j + 1;
                    // ˆÚ?“‰ºˆê˜¢•s‘Š“™“IŒ³‘f
                    while (j0 < k && nums[j0] == nums[j]) {
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }
}

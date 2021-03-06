class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // ? a
        for (int i = 0; i < n; ++i) {
            // Ϋ?aγκ?I³fs
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // gpow?? b a c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // @Κa? target ΌΪΤρΔ
                if (sum == target) {
                    return target;
                }
                // ͺ·?I???XVΔ
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // @Κaε° targetCΪ? c ??Iw?
                    int k0 = k - 1;
                    // Ϊ?Ίκ’sI³f
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // @Κa¬° targetCΪ? b ??Iw?
                    int j0 = j + 1;
                    // Ϊ?Ίκ’sI³f
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

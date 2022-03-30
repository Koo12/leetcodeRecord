class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // ��? a
        for (int i = 0; i < n; ++i) {
            // ��?�a��ꎟ��?�I���f�s����
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // �g�p�o�w?��? b �a c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // �@�ʘa? target ���ڕԉ񓚈�
                if (sum == target) {
                    return target;
                }
                // ������?�I???���X�V����
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // �@�ʘa�嘰 target�C��? c ??�I�w?
                    int k0 = k - 1;
                    // ��?�����꘢�s�����I���f
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // �@�ʘa���� target�C��? b ??�I�w?
                    int j0 = j + 1;
                    // ��?�����꘢�s�����I���f
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

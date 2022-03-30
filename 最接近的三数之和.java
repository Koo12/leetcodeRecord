class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int a=0;
        int b=1;
        int c=2;
        int sum = 0;
        int result = target-(nums[0]+nums[1]+nums[2]);
        if(result < 0){
            result = 0-result;
        }
        int diff = 0;
        int fh = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int n=j+1;n<nums.length;n++){
                    diff = target - (nums[i]+nums[j]+nums[n]);
                    if(diff < 0){
                        diff = 0-diff;
                    }
                    if(result>diff){
                        result = diff;
                        a=i;
                        b=j;
                        c=n;
                    }
                }
            }
        }
        sum = (nums[a]+nums[b]+nums[c]);
        return sum;
    }
}
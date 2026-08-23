package leetcode;

public record Test() {
    public static void main(String[] args) throws Exception {
        int[] nums = {3, 2, 2, 3};
        int target = minSubArrayLen(5, nums);
        System.out.println(target);
    }

//
//public static int arraySum(int[] nums, int val) {
//    int slowIndex=0;
//    for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
//        if(nums[fastIndex]!=val){
//            nums[slowIndex++]=nums[fastIndex];
//        }
//    }
//    return slowIndex;
//}
//}

    // 滑动窗口
    public static int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}


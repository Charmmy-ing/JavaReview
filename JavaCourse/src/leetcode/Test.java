package leetcode;

public record Test() {
    public static void main(String[] args)throws Exception {
        int[] nums={3,2,2,3};
     System.out.println(arraySum(nums,2));
    }

public static int arraySum(int[] nums, int val) {
    int slowIndex=0;
    for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
        if(nums[fastIndex]!=val){
            nums[slowIndex++]=nums[fastIndex];
        }
    }
    return slowIndex;
}
}


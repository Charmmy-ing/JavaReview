package JavaFoundationalCourse;
import  java.util.*;


public class DataStructures {
    public static void main(String[] args) {
        int lefit=0;
        int right=nums.length();
        int mid;
        if(target<nums[0]||target>nums[nums.length()-1]){
            return -1;
        }

        while(lefit<=right){
            if(nums[mid]==target){
                return mid;
            }
            int mid=lefit+((right-lefit)>>1);
            if(nums[mid]<target){
                lefit=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    }
}

package Day6;

public class TwoSum {//finding two elements in an array whose sum is equal to target leetcode problem
    public static void main(String[] args) {

        int[] nums={2,7,11,15};
        int target=9;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

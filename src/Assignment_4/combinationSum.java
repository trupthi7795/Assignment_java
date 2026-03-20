package Assignment_4;
// LeetCode 39 - Combination Sum
import java.util.*;

class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),result);
        return result;
    }

    private void backtrack(int start,int[] nums,int target,List<Integer> temp,List<List<Integer>> result){

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(target<0) return;

        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i,nums,target-nums[i],temp,result);
            temp.remove(temp.size()-1);
        }
    }
}
/*
3Sum
-----

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Input: nums = []
Output: []

Input: nums = [0]
Output: []
*/

//Java Solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while(left<right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0) result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                else if(sum<0) left++;
                else right--;
            }
        }
        return new ArrayList<>(result);
    }
}



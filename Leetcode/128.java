/*
Longest Consecutive Sequence
-----------------------------

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

Follow up: Could you implement the O(n) solution?

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/

//Java Solution

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int result = 0;
        for(int num : nums) {
            int val = num; 
            set.remove(val);
            int length=1;
            while(set.contains(++val)) {
                length++;
                set.remove(val);
            }
            while(set.contains(--num)) {
                length++;
                set.remove(num);
            }
            result = Math.max(length, result);
        }
        return result;
    }
}

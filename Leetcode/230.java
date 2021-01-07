/*
Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
*/

// Java Solution

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int nodes = 0;
    int result = -1;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        post(root, k);
        return result;
    }
    private void post(TreeNode root, int k) {
        if(root==null || result!=-1) return;
        post(root.left, k);
        nodes++;
        if(nodes==k) result = root.val;
        post(root.right, k);
    }
}

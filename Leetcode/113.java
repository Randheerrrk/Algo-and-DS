/*
Path Sum II
------------

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1

Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
*/

//Java Solution

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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return result;
        List<Integer> path = new ArrayList<>();
        dfs(root, path, sum);
        return result;
    }
    private void dfs(TreeNode root, List<Integer> path, int sum) {
        if(root==null) return;
        if(root.left==null && root.right==null && sum-root.val==0) {
            path.add(root.val);
            result.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        path.add(root.val);
        if(root.left!=null) dfs(root.left, path, sum-root.val);
        if(root.right!=null) dfs(root.right, path, sum-root.val);
        path.remove(path.size()-1);
    }
}

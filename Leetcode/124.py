'''
Binary Tree Maximum Path Sum
-----------------------------

Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any node sequence from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.


Input: root = [1,2,3]
Output: 6

Input: root = [-10,9,20,null,null,15,7]
Output: 42

'''

# Python Solution

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: TreeNode) -> int:
        if(root==None) : return 0
        result = -math.inf
        def dfs(root: TreeNode) :
            if(root==None) : return 0
            left = dfs(root.left)
            right = dfs(root.right)
            nonlocal result
            result = max(result, root.val, root.val+left+right, root.val+left, root.val+right)
            return max(root.val, root.val+left, root.val+right)
        dfs(root)
        return result

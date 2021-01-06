'''
Binary Tree Postorder Traversal
--------------------------------

Given the root of a binary tree, return the postorder traversal of its nodes' values.

Input: root = [1,null,2,3]
Output: [3,2,1]

Input: root = []
Output: []

Input: root = [1]
Output: [1]

Input: root = [1,2]
Output: [2,1]

Input: root = [1,null,2]
Output: [2,1]
'''

# Python Solution

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        if(not root) : return []
        result = []
        def pot(root : TreeNode) : 
            if(root.left) : pot(root.left)
            if(root.right) : pot(root.right)
            result.append(root.val)
        pot(root)
        return result
            
    

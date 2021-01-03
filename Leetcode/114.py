'''
Flatten Binary Tree to Linked List
-----------------------------------

Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
'''

# Python Solution

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: TreeNode) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        if(root==None) : return None
        def dfs(root) :
            if(root==None) : return None
            left = dfs(root.left)
            right = dfs(root.right)
            if(left) :
                temp = left
                while(temp.right) :
                    temp = temp.right
                temp.right = right
                root.right = left
                root.left = None
            return root
        dfs(root)
                
        

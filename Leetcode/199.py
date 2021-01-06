'''
Binary Tree Right Side View
----------------------------

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
'''

# Python Solution

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        if(not root) : return []
        result = []
        def bfs(root : TreeNode) :
            q = [root]
            while q :
                s = len(q)
                result.append(q[0].val)
                for i in range(s) :
                    temp = q.pop(0)
                    if(temp.right) : q.append(temp.right)
                    if(temp.left) : q.append(temp.left)
        bfs(root)
        return result
                    

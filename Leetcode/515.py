'''
Find Largest Value in Each Tree Row
------------------------------------

Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

Input: root = [1,3,2,5,3,null,9]
Output: [1,3,9]

Input: root = [1,2,3]
Output: [1,3]

Input: root = [1]
Output: [1]

Input: root = [1,null,2]
Output: [1,2]

Input: root = []
Output: []
'''

# Python Solution

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: TreeNode) -> List[int]:
        if(root==None) : return []
        result = []
        def bfs(root: TreeNode) :
            q = [root]
            nonlocal result
            while q :
                s = len(q)
                levelMax = -math.inf
                for i in range(s) :
                    temp = q.pop(0)
                    levelMax = max(temp.val, levelMax)
                    if(temp.left) : q.append(temp.left)
                    if(temp.right) : q.append(temp.right)
                result.append(levelMax)
        bfs(root)
        return result

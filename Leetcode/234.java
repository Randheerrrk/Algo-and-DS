/* 
Palindrome Linked List
----------------------
Given a singly linked list, determine if it is a palindrome.

Input: 1->2
Output: false

Input: 1->2->2->1
Output: true
*/

// Java Solution

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        slow = reverse(slow);
        while(fast!=null && slow!=null) {
            if(slow.val!=fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head!=null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}

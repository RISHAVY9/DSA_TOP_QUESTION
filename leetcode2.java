/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to serve as the start of the new linked list.
        // This makes handling the head of the result list much simpler.
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes in either list or there is a remaining carry.
        while (l1 != null || l2 != null || carry != 0) {
            
            // Get the value of the current node from l1, or 0 if l1 is null.
            int x = (l1 != null) ? l1.val : 0;
            
            // Get the value of the current node from l2, or 0 if l2 is null.
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the digits plus the carry from the previous step.
            int sum = x + y + carry;
            
            // Update the carry for the next iteration (sum / 10).
            carry = sum / 10;
            
            // The digit for the current node is the remainder of the sum (sum % 10).
            // Create a new node with this digit and link it to the current list.
            current.next = new ListNode(sum % 10);
            
            // Move the current pointer to the newly created node.
            current = current.next;

            // Move the pointers of the input lists forward, if they exist.
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // The result list starts at dummyHead.next, since dummyHead was just a placeholder.
        return dummyHead.next;
    }
}

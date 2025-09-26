/**
 * Definition for singly-linked list.
 * public class ListNode {
 * // ... (same as above)
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base case: If one list is null, return the other one.
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Recursive Step: Compare values
        if (list1.val <= list2.val) {
            // list1's current node is the head of the merged list.
            // Its 'next' is the result of merging the rest of list1 (list1.next) with list2.
            list1.next = mergeTwoLists(list1.next, list2);
            return list1; // Return list1 as the current head
        } else {
            // list2's current node is the head of the merged list.
            // Its 'next' is the result of merging list1 with the rest of list2 (list2.next).
            list2.next = mergeTwoLists(list1, list2.next);
            return list2; // Return list2 as the current head
        }
    }
}

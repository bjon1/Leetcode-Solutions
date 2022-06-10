/*

    21. Merge Two Sorted Lists
    
        Given: the heads of two sorted linked lists, list1 and list2
        
        Merge the two lists in a one sorted list. 
        The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list
        
    EXAMPLE:
        1 -> 2 -> 4
        1 -> 3 -> 4
        
        1 -> 1 -> 2 -> 3 -> 4 -> 4  


  *Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        return mergeTwoLists(list1, list2, curr, result);
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2, ListNode curr, ListNode result) {
        
        if(list1 == null && list2 != null){
            curr.next = new ListNode(list2.val);
            return mergeTwoLists(list1, list2.next, curr.next, result);
        } else if(list2 == null && list1 != null){
            curr.next = new ListNode(list1.val);
            return mergeTwoLists(list1.next, list2, curr.next, result);
        }
        
        if(list1 == null && list2 == null){ //for this conditional to be satisfied, all values must have been copied
            return result.next;
        }

        if(list1.val <= list2.val){
            curr.next = new ListNode(list1.val); 
            return mergeTwoLists(list1.next, list2, curr.next, result);
        } else {
            curr.next = new ListNode(list2.val);
            return mergeTwoLists(list1, list2.next, curr.next, result);
        }
    }
} 
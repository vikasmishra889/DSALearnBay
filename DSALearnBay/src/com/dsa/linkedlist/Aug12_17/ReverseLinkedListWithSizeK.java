package com.dsa.linkedlist.Aug12_17;

/**
 * Created by vikas.e.mishra on 8/12/2017.
 * <p>
 * Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3
 * Output:  3->2->1->6->5->4->8->7->NULL.
 * <p>
 * Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
 * Output:  5->4->3->2->1->8->7->6->NULL.
 * <p>
 * Algorithm: reverse(head, k)
 * 1) Reverse the first sub-list of size k. While reversing keep track of the next node and previous node.
 *    Let the pointer to the next node be next and pointer to the previous node be prev. See this post for reversing a linked list.
 * 2) head->next = reverse(next, k) /* Recursively call for rest of the list and link the two sub-lists
 * 3) return prev /* prev becomes the new head of the list (see the diagrams of iterative method of this post)
 *
 * http://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
 */

public class ReverseLinkedListWithSizeK {

}

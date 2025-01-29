# LL: Remove Last

Implement a method called `removeLast` that removes the last node 
from the linked list.

Return type: `Node` (we are returning the Node that is being removed)
 
The method should perform the following tasks:
1. If the length of the linked list is 0, return null.
2. Create two variables that can point to a `Node`, `temp` and `pre`,
both initially pointing to the head of the linked list.
3. Traverse the linked list until `temp.next` is null, performing 
the following tasks during traversal:
   - Update `pre` to point to the current `temp` node.
   - Update `temp` to point to the next node in the linked list.
4. After traversal, set the `tail` pointer to `pre`.
5. Set the `next` attribute of the `tail` node to null.
6. Decrement the `length` attribute of the list by 1.
7. If the length of the linked list becomes 0 after removing the 
last node, set both the `head` and `tail` pointers to null.
8. Return the removed node (pointed to by `temp`).

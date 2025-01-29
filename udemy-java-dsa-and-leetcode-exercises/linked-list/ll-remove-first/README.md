# LL: Remove First

Implement a method called `removeFirst` that removes the first node 
from the linked list and returns it.

Return type: `Node` (the node that is removed)

The method should perform the following tasks:
1. If the length of the linked list is 0, return null.
2. Create a temporary Node object called `temp` and set it to the 
current head node.
3. Update the head pointer of the list to point to the next node in 
the list.
4. Set the `next` attribute of `temp` to null.
5. Decrement the length attribute of the list by 1.
6. If the length of the list becomes 0 after removing the first node,
set the tail pointer to null.
7. Return the removed `temp` node.
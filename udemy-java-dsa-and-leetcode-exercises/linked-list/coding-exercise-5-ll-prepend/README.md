# LL: Prepend

Implement a method called `prepend` that adds a new node at the 
beginning of the linked list.

Return type: `void`

The method should perform the following tasks:
1. Accept an integer value as an argument, which will be the value of the new node.
2. Create a new Node object called `newNode` with the given value.
3. If the length of the linked list is 0, set both the head and tail pointers of the list to the `newNode`. 
4. If the length of the linked list is greater than 0, perform the following tasks:
   - Set the `next` attribute of `newNode` to the current head node.
   - Update the head pointer of the list to point to the `newNode`.
5. Increment the length attribute of the list by 1.

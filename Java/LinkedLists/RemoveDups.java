//LL Remove Duplicates - O(n)
//Remove the duplicates in the unsorted linked list
//Temporary buffer is not allowed

//Methodology: track duplicates using a hash table
            // iterate through LL add each element to hash table
            // Remove dup when iteration lands on it
            // finishes in one pass bc it is a linked list

void deleteDups(LinkedListNode n) {
    HashSet<Integer> set = new HashSet<>();
    LinkedListNode previous = null;
    while (n != null) {
        if(set.contains(n.data)) {
            previous.next = n.next;
        } else {
            set.add(n.data);
            previous = n;
        }
        n = n.next;
    }
}

//-----------------------------------------------------------------

//Without the temporary buffer

    void deleteDulps(LinkedListNode n) {
        LinkedListNode current = head;
        while(current != null) {
            LinkedListNode runner = current;
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

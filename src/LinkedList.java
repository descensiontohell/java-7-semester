public final class LinkedList {

    private Node root;
    private Node lastNode;
    private int size = 0;

    public LinkedList(Node node) {
        this.setRoot(node);
        this.setLastNode(this.getRoot());
        this.setSize(1);
    }

    private Node getRoot() {
        return this.root;
    }

    private void setRoot(Node node) {
        this.root = node;
    }

    private int getLastIndex() {
        return this.getSize() - 1;
    }

    public int getSize() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private Node getLastNode() {
        return this.lastNode;
    }

    private void setLastNode(Node node) {
        this.lastNode = node;
    }

    public void add(Node node) {
        /**
         * Used to add a new node to the end of the LinkedList
         * Node that was the last node before receives this node as its Node.next value
         *
         * @param node node that should be added
         */

        // If the size of a LinkedList equals zero, the new node will be its root
        if (this.getSize() == 0) {

            // Set new node as root and set new size
            this.setRoot(node);
            this.setSize(1);

            return;
        }

        // Connect the previous last node with a new one
        this.getLastNode().setNext(node);

        // Set new node as last node
        this.setLastNode(node);

        // Increment size
        this.setSize(this.getSize() + 1);
    }

    public Node getByIndex(int target_index) throws LinkedListIndexOutOfBoundsException {
        /**
         * Used to get a LinkedList node by index
         * Throws LinkedListIndexOutOfBoundsException upon wrong index
         * Make sure you check the LinkedList size with getSize() method
         *
         * @param target_index index of the element that should be returned
         * @return the node with target index
         */

        // Corner cases

        // If target index is out of bounds, throw exception
        if (target_index > this.getLastIndex()) {
            throw new LinkedListIndexOutOfBoundsException();
        }

        // If target index is zero, return the root
        if (target_index == 0) {
            return this.getRoot();
        }

        // Traverse nodes starting from the root
        int current_index = 0;
        Node node = this.getRoot();

        while (true) {
            // No additional checks needed since the target node presence is guaranteed
            node = node.getNext();

            current_index++;

            // If we reached the target index, return the node
            if (target_index == current_index) {
                return node;
            }
        }
    }

    public void display() {
        /**
         * Used to print all the elements of a LinkedList
         * If LinkedList is empty, prints the according message
         */

        // If size equals zero, the list is empty
        if (this.getSize() == 0) {
            System.out.println("The LinkedList is empty");
            return;
        }
        else {
            System.out.println("Linked list elements:");
        }

        // Traverse the LinkedList, root is the first node
        Node node = this.getRoot();
        String result = Integer.toString(node.getValue());

        while (true) {

            if (node.hasNext()) {
                node = node.getNext();
            }
            // If current node is the last
            else {
                break;
            }

            // Concatenate the values
            result = result + " " + node.getValue();

        }

        System.out.println(result);
    }

    public void removeByIndex(int index) throws LinkedListIndexOutOfBoundsException {
        /**
         * Used to remove node from a LinkedList by index
         * Throws LinkedListIndexOutOfBoundsException upon wrong index
         * Make sure you check the LinkedList size with getSize() method
         *
         * @param index index of the element that should be removed
         */

        // Corner cases

        // If index is bigger than the last node index, throw exception
        if (index > this.getLastIndex()) {
            throw new LinkedListIndexOutOfBoundsException();
        }

        // If index points to the last node, for second to last node set next = null
        else if (index == this.getLastIndex()) {
            Node second_to_last = this.getByIndex(this.getLastIndex());
            second_to_last.setNext(null);
        }

        // If index points to the root
        else if (index == 0) {

            // Get second from the left node
            Node new_root = this.getRoot().getNext();

            // And set it as new root node
            this.setRoot(new_root);

            this.setSize(this.getSize()-1);
        }

        else {

            // Traverse the LinkedList keeping count of node index
            // Root node is the first node
            Node first_node = this.getRoot();
            Node second_node;
            int second_index = 0;

            while (true) {

                // Keep track of node with index N and node with index N+1
                second_node = first_node.getNext();
                second_index++;

                // When node N+1 is the target node, get its next node and assign it as next for node N
                if (second_index == index) {
                    Node next_to_removed_node = second_node.getNext();
                    first_node.setNext(next_to_removed_node);
                    return;
                }


                first_node = second_node;
            }
        }
    }

    public void removeByReference(Node node) {
        /**
         * Used to remove node from a LinkedList by reference
         * Make sure that node you want to remove exists in this LinkedList
         *
         * @param node reference to a target node
         */

        // Traverse the LinkedList starting with the root node which is the first one
        Node first_node = this.getRoot();
        Node second_node;

        while (true) {

            second_node = first_node.getNext();

            // == checks reference to the object
            if (second_node == node) {

                // If node is the target node, get its next node and assign it as next for previous node
                Node next_to_removed_node = second_node.getNext();
                first_node.setNext(next_to_removed_node);
                return;
            }

            first_node = second_node;
        }
    }

    public void clear() {
        this.setRoot(null);
        this.setSize(0);
    }
}

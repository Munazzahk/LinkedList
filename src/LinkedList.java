public class LinkedList {
    private Node head;

    public void addFirst(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node newHead = new Node(value);
            newHead.setNext(head);
            head = newHead;
        }
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = new Node(value);
        }
    }

    public void addAtIndex(int value, int index) {
        Node currentNode = head;
        Node givenNode = new Node(value);

        while (currentNode.next != null) {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }

            givenNode.setNext(currentNode.next);
            currentNode.next = givenNode;
        }
    }

    public void removeFirst() {
        Node currentNode = head;
        this.head = currentNode.next;
    }


    
}


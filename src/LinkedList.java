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

    public void removeLast() {
        int count = 0;
        Node currentNode = head;
        Node newLast = head;

        if (head != null) {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                count++;
            }

            for (int i = 0; i < count; i++) {
                newLast = newLast.next;
            }
            newLast.setNext(null);
        } else {
            System.out.println("This LinkedList doesnt have any nodes yet");;
        }

    }

    public void removeAtIndex(int index) {
        Node currentNode = head;

        while (currentNode.next != null) {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;

        }
    }




    
}


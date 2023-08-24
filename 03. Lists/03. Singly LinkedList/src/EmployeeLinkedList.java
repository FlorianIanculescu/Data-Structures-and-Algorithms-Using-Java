public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);

        head = node;

        size++;
    }

    public EmployeeNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;

        head = head.getNext();

        size--;

        removeNode.setNext(null);

        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {

        return head == null;
    }

    public void printList() {

        EmployeeNode current = head;

        System.out.println("HEAD -> ");

        while (current != null) {

            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

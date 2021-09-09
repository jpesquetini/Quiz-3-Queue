package Code;

public class DoublyLinkedList {
    private Node head;
    private Node last;
    private int size;

    public DoublyLinkedList() {
            this.head = null;
            this.last = null;
            this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getSize() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public void insertLast(Object data) {
            Node newNode = new Node(data);

            if (this.isEmpty()) {
                this.head = this.last = newNode;
            }
            else {
                Node temp = this.last;
                
                temp.setNext(newNode);
                newNode.setPrev(temp);
                this.last = newNode;
            }
            this.size++;
    }

    public Node deleteFirst() {
        if (this.isEmpty()) {
            return null;
        }
        else {
            Node temp = this.head;

            this.head = temp.getNext();
            this.size--;
            return temp;
        }
    }
}

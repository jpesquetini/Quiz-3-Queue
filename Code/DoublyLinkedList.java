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

    /*
    public static void main(String[] args) {
        DoublyLinkedList prueba = new DoublyLinkedList();
        
        prueba.insertLast(23);
        prueba.insertLast(24);
        prueba.insertLast(25);
        prueba.insertLast(26);
        prueba.insertLast(27);

        int size = prueba.getSize();
        System.out.println(size);

        Object data1 = prueba.head.getData();
        Object data2 = prueba.head.next.getData();
        Object data3 = prueba.head.next.next.getData();
        Object data4 = prueba.head.next.next.next.getData();
        Object data5 = prueba.head.next.next.next.next.getData();

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);

        prueba.deleteFirst();
        prueba.deleteFirst();
        prueba.deleteFirst();

        int size2 = prueba.getSize();
        System.out.println(size2);

        Object data6 = prueba.head.getData();
        Object data7 = prueba.head.next.getData();

        System.out.println(data6);
        System.out.println(data7);

        Node dequeued = prueba.deleteFirst();
        System.out.println(dequeued.getData());
    }
    */
}

package Code;

public class Queue {
    private DoublyLinkedList queue;

    public Queue() {
        queue = new DoublyLinkedList();
    }

    public void enqueue(Object newData) {
        this.queue.insertLast(newData);
    }

    public Node dequeue() {
        return this.queue.deleteFirst();
    }

    public Node peek() {
        return this.queue.getHead();
    }

    public void printQueue(Queue queue) {
        while(queue.peek() != null) {
            Node element;

            element = queue.dequeue();
            System.out.println(element.getData());
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue(queue);
    }
}

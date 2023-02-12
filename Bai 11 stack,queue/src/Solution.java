public class Solution {

    Queue queue = new Queue();

    public class Node{
        public int data;
        public Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    class Queue{
        public Node front;

        public Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (queue.rear == null) {
            queue.front = queue.rear = newNode;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = newNode;
            queue.rear = newNode;
            queue.rear.link = queue.front;
        }
    }

    public void deQueue() {
        if (queue.front == null) {
            System.out.println("NULL");
        } else if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }

    public void displayQueue() {
        Node temp = queue.front;
        while (temp != queue.rear) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(queue.rear.data);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(5);
        solution.enQueue(21);
        solution.enQueue(11);
        solution.deQueue();
        solution.deQueue();
        solution.displayQueue();
    }

}



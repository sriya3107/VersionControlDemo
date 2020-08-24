class Queue {

    private static int front, rear, capacity;

    private static int queue[];



    Queue(int c)

    {

        front = rear = 0;

        capacity = c;

        queue = new int[capacity];

    }





    static void enqueue(int data)

    {


        if (capacity == rear) {

            System.out.printf("\nQueue is full\n");

        }





        else {

            queue[rear] = data;

            rear++;

        }



    }





    static void dequeue()

    {

        if (front == rear) {

            System.out.printf("\nQueue is empty\n");



        }




        else {

            for (int i = 0; i < rear - 1; i++) {

                queue[i] = queue[i + 1];

            }

            rear--;

        }

    }





    static void queueDisplay()

    {

        int i;

        if (front == rear) {

            System.out.printf("\nQueue is Empty\n");



        }





        for (i = front; i < rear; i++) {

            System.out.printf(" %d <-- ", queue[i]);

        }



    }




}



public class QueueUsingArray {

    public static void main(String[] args)

    {
        Queue q = new Queue(4);
        q.queueDisplay();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.queueDisplay();
        q.enqueue(60);
        q.queueDisplay();
        q.dequeue();
        q.dequeue();
        System.out.printf("\n\nafter two node deletion\n\n");
        q.queueDisplay();


    }
}
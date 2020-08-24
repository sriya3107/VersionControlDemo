import java.util.NoSuchElementException;
import java.util.Stack;
import java.io.*;

class QueueUsingStacks {

    private Stack stack1 = new Stack<Integer>();
    private Stack stack2 = new Stack<Integer>();

    public void enqueue(int val) {
        //stack1.push(val);
        if (stack1.size() == 0)
            stack1.push(val);
        else {
            int l = stack1.size();
            for (int i = 0; i < l; i++)
                stack2.push(stack1.pop());

            stack1.push(val);
            for (int i = 0; i < l; i++)
                stack1.push(stack2.pop());
        }
    }


    public int dequeue() {

        if (stack1.size() == 0)
            throw new NoSuchElementException("Underflow Exception");
        return (int) stack1.pop();
    }
    public void display()
    {
        System.out.print("\nQueue = ");
        int l = stack1.size();
        if (l == 0)
            System.out.print("Empty\n");
        else
        { for (int i = l - 1; i >= 0; i--)
            System.out.print(stack1.get(i)+" ");
            System.out.println();
        }
    }


    public  static class Queue {
        public static void main(String[] args) {

            QueueUsingStacks qu = new QueueUsingStacks();
            qu.enqueue(3);
            qu.enqueue(4);
            qu.display();
            qu.enqueue(5);
            qu.dequeue();
            qu.display();

            qu.enqueue(6);
            qu.enqueue(7);
            qu.display();

            qu.dequeue();
            qu.dequeue();
            qu.dequeue();
            qu.display();

        }
    }
}

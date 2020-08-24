import java.util.*;

class Stack {
    Queue<Integer> q;
    Queue<Integer> temp;


    public Stack() {
        q = new LinkedList<Integer>();
        temp = new LinkedList<Integer>();
    }
    public void push(int data) {
        if (q.size() == 0)
            q.add(data);
        else {
            int l = q.size();
            for (int i = 0; i < l; i++)
                temp.add(q.remove());
            q.add(data);
            for (int i = 0; i < l; i++)
                q.add(temp.remove());
        }
    }


    public int pop() {
        if (q.size() == 0)
            throw new NoSuchElementException("Underflow Exception");
        return q.remove();
    }


    public int peek() {
        if (q.size() == 0)
            throw new NoSuchElementException("Underflow Exception");
        return q.peek();
    }


    public boolean isEmpty() {
        return q.size() == 0;
    }

    public void display() {
        System.out.print("Stack = ");
        int l = q.size();
        if (l == 0)
            System.out.print("Empty\n");
        else {
            Iterator i = q.iterator();
            while (i.hasNext())
                System.out.print(i.next() + " ");
            System.out.println();
        }
    }
}


public class StackUsingQueue {
    public static void main(String[] args) {
        Stack suq = new Stack();
        suq.push(3);
        suq.push(2);
        suq.push(5);
        suq.display();
        suq.pop();
        suq.display();
        suq.push(8);
        suq.push(10);
        suq.pop();
        suq.display();
        suq.push(1);
        suq.display();
    }
}

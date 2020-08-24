import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int data) {

        int min = data;

        if (!minStack.isEmpty() && min > minStack.peek()) {
            min = minStack.peek();
        }

        stack.push(data);
        minStack.push(min);
    }

    public void pop() {

        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static class MinEle {

        public static void main(String[] args) {

            MinStack minElem = new MinStack();

            minElem.push(4);
            minElem.push(5);
            minElem.push((3));
            System.out.println(" Minimum Element from Stack " + minElem.getMin());
            minElem.push(8);
            System.out.println(" Minimum Element from Stack " + minElem.getMin());
            minElem.push(2);

            minElem.push(1);
            System.out.println(" Minimum Element from Stack " + minElem.getMin());

            minElem.pop();

            System.out.println(" Minimum Element from Stack " + minElem.getMin());
        }
    }
}
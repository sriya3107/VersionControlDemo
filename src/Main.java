class StackUsingArray {
    int SIZE=100;
    int top=-1;
    int arr[]=new int[SIZE];


    public boolean isempty() {
        if ( top == -1 )
            return true ;
        else
            return false;
    }

    public boolean isfull(){
        if(top==SIZE-1)
            return true;
        else
            return false;
    }

    public void push(int ele) {
        if (ele!='\0') {
            if (!isfull()) {
                arr[++top] = ele;
                System.out.println(ele + "has been pushed onto the stack ");
            } else {
                System.out.println("Stack is full,so overflow occurs");
            }
        }
    }
    public int pop(){
        if(!isempty()){
            int val=arr[top];
            top--;
            System.out.println(val+"has been popped off the stalk");
            return val;
        }else{
            System.out.println("Value cant be popped off as it is empty");
            return -1;
        }
    }
    static class Main{
        public static void main(String args[]){
            StackUsingArray stack=new StackUsingArray();
            stack.push(0);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();

        }
    }
}
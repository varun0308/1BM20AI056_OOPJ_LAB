abstract class data_structure{
    abstract void push(int ele);
    abstract void pop();
    abstract void top();
    abstract boolean isEmpty();
    abstract boolean isFull();
}

class cust_stack extends data_structure{
    int stack[] = new int[5];
    int top = -1;
    void push(int ele){
        if(top == 4)
        {
            System.out.println("Full stack! Push operation not possible");
        }
        else{
            top++;
            stack[top] = ele;
        }
    }
    void pop(){
        if(isEmpty())
        {
            System.out.println("Empty stack! Pop operation not possible");
        }
        else{
            top--;
        }
    }
    void top(){
        System.out.println("Top is "+ top);
    }
    boolean isEmpty(){
        if(top == -1)
        {
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(top == 4)
        {
            return true;
        }
        return false;
    } 
}

public class stack_queues {
    public static void main(String[] args) {
        data_structure stack = new cust_stack();
        System.out.println(stack.isFull()); 
        stack.top();
        stack.push(5);
        stack.top();
    }
    
}

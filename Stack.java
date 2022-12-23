import java.util.EmptyStackException;

class Stack{
    //Stack using array
    int len;
    int [] arr;
    int top = -1;

    public Stack(){
        len = 10;
        arr = new int [len];
    }

    public Stack(int len){
        this.len = len;
        arr = new int [len];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == len-1;
    }

    public void push(int arr){
        if(isFull()) throw new StackOverflowError("Stack overflow");
        top = top+1;
        this.arr[top] = arr;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();
        int pop_arr = arr[top];
        top -= 1;
        return pop_arr;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return arr[top];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0; i<=top;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        Stack stack = new Stack();
        try{
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();
            stack.display();
        }catch(EmptyStackException ese){
            System.out.println(ese.getMessage());
        }catch(StackOverflowError soe){
            System.out.println(soe.getMessage());
        }
    }
}
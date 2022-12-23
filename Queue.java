class Queue {
    int length;
    int [] arr;

    Queue(){
        this.length = 0;
        this.arr = new int[10];
    }
    Queue(int capacity){
        this.length = 0;
        this.arr = new int[capacity];
    }

    void enqueue(int data){
        if(length == arr.length){
            System.out.println("Queue is over");
            System.exit(1);
        }
        arr[length] = data;
        length++;
    }

    int dequeue(){
        int [] newarr = new int[arr.length];
        int item = arr[0];

        for (int i = 1; i< length; i++){
            newarr[i-1] = arr[i];
        }
        arr = newarr;
        length--;
        return item;
    }

    void printElements(){
        for (int i=0; i<length -1; i++){
            System.out.print(arr[i]);
            System.out.print("<-");
        }

        System.out.println(arr[length-1]);
    }

    public int peek(){
        return arr[0];
    }

    public static void main(String args []){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.printElements();

    }
}
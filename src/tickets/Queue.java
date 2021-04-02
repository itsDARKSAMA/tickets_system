package tickets;

public class Queue<E> {

    private int maxSize;
    private int rear = -1;
    private int front = 0;
    private E data[];
    private int noItems;
    private E temp;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.data = (E[]) new Object[maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getRear() {
        return rear;
    }

    public int getFront() {
        return front;
    }

    public E[] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public int getNoItems() {
        return noItems;
    }

    //Queue Methods

    public boolean isFull() {
        return maxSize == noItems;
    }

    public boolean isEmpty() {
        return noItems == 0;
    }

    public void Enqueue(E newVal) {

        if (isFull()) {
            System.out.println("Sorry, the number is complete, please try again later");
        } else {

            if (rear == maxSize - 1) {
                rear = -1;
            }
            data[++rear] = newVal;
            noItems++;

        }

    }

    public E Dequeue() {
        if (isEmpty()) {
            System.out.println("There is No New Tickets");
        } else {
            temp = data[front];
            data[front] = null;
            front++;
            if (front == maxSize) {
                front = 0;
            }
            noItems--;
        }
        return temp;
    }

    public E queueCurrent() {
        return temp;
    }

}

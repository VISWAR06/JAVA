import java.util.*;

class Q {
    int front, rear, count;
    int[] arr;

    Q(int size) {
        front = -1;
        rear = -1;
        count = 0;
        arr = new int[size];
    }

    // Push operation
    void push(int val) {
        if ((rear + 1) % arr.length == front) {
            System.out.println("Queue is full!");
            return;
        }

        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            arr[rear] = val;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = val;
        }

        count++;
        System.out.println("Pushed: " + val + " -> " + Arrays.toString(arr));
    }

    // Pop operation
    void pop() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty!");
            return;
        }

        int removed = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }

        count--;
        System.out.println("Popped: " + removed + " -> " + Arrays.toString(arr));
    }

    // Peek (front element)
    void top() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front: " + arr[front]);
    }

    // Size
    void size() {
        System.out.println("Current size: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Q q = new Q(4);
        
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50); // Should say full

        q.top();    // Front: 10
        q.size();   // Size: 4

        q.pop();    // Removes 10
        q.pop();    // Removes 20

        q.top();    // Front: 30
        q.size();   // Size: 2

        q.push(60); // Should wrap around
        q.push(70); // Should say full
    }
}

package day16.queue imple;

import java.util.*;

class Q {
    int s, e, c;
    int[] arr;

    Q(int n) {
        s = -1;
        e = -1;
        c = 0;
        arr = new int[n];
    }

    void push(int n) {
        if ((e + 1) % arr.length == s) {
            System.out.println("Queue is full!");
            return;
        }

        if (s == -1 && e == -1) {
            s = 0;
            e = 0;
            arr[e] = n;
        } else {
            e = (e + 1) % arr.length;
            arr[e] = n;
        }
        c++;
        System.out.println(Arrays.toString(arr));
    }
}

class Main {
    public static void main(String[] args) {
        Q q = new Q(4);
        q.push(3);
        q.push(5);
        q.push(7);
        q.push(9);  // This one should give "Queue is full!"
    }
}

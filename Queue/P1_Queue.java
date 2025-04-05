package Queue;

import java.util.Queue;

import java.util.LinkedList;

public class P1_Queue {
    static Queue <Integer> q=new LinkedList<>();

    static boolean isEmpty(){
        return q.isEmpty();
    }
    static void qEnqueue(int data) {
        q.add(data);
    }

    static void qDequeue() {
        if (isEmpty()) {
            return;
        }
        q.poll();
    }

    static int getFront() {
        if (isEmpty()) return -1;
        return q.peek();
    }

    static int getRear() {
        if (isEmpty()) return -1;
        return ((LinkedList<Integer>) q).getLast();
    }
    public static void main(String[] args) {
        qEnqueue(1);
        qEnqueue(8);
        qEnqueue(3);
        qEnqueue(6);
        qEnqueue(2);

        if (!isEmpty()) {
            System.out.print("Queue after enqueue operation: ");
            for (int num : q) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Front: " + getFront());
        System.out.println("Rear: " + getRear());

        System.out.println("Queue size: " + q.size());

        qDequeue();

        System.out.println("Is queue empty? "+(isEmpty() ?"Yes":"No"));
    }
    }


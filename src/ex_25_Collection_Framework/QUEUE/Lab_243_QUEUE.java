package ex_25_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab_243_QUEUE {

    public static void main(String[] args){

        //QUEUE
        //FIFO
        PriorityQueue queue = new PriorityQueue();
        queue.add("test");
        queue.add("datta");
        queue.add("pramod");
        System.out.println(queue);  //natural sorting

        System.out.println(queue.peek());
//        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

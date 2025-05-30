import java.util.*;
public class heap{
    public static void main(String[] args){
        PriorityQueue<Integer> MinHeap=new PriorityQueue<>();
        MinHeap.add(5);
        MinHeap.add(50);
        MinHeap.add(1);
        MinHeap.add(4);
        MinHeap.add(9);
    System.out.println("Min-Heap:"+MinHeap);
    System.out.println("peek (Min):"+MinHeap.peek());
    System.out.println("Extract (Min):"+MinHeap.poll());
    System.out.println("Min-Heap after extract:"+MinHeap);
     PriorityQueue<Integer> MaxHeap=new PriorityQueue<>(Collections.reverseOrder());
        MaxHeap.add(5);
        MaxHeap.add(50);
        MaxHeap.add(1);
        MaxHeap.add(4);
        MaxHeap.add(9);
    System.out.println("Max-Heap:"+MaxHeap);
    System.out.println("peek (Max):"+MaxHeap.peek());
    System.out.println("Extract (Max):"+MaxHeap.poll());
    System.out.println("Max-Heap after extract:"+MaxHeap);
    }
}
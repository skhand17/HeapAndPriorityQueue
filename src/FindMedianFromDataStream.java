


/*
 * Very very good question
 * Small Heaps and Large Heaps
 * Size should be almost equal
 * Two heaps are required one is max and other is min heap
 * Find the max in heap is 0(1) and find the min in min heap is o(1)
 * Max Heap will have smaller elements and Min Heap will have larger elements - intuitive
 * We have to find the median in O(1) TIME
 * */

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {

    private Queue<Integer> maxHeap;
    private Queue<Integer> minHeap;

    public FindMedianFromDataStream() {
        this.maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        this.minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
//        Adding number to the small or the max heap
        maxHeap.offer(num);

        if (maxHeap.size() - minHeap.size() > 1 || !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){
            minHeap.add(maxHeap.poll());
        }

        if(minHeap.size() - maxHeap.size() > 1){
            maxHeap.add(minHeap.poll());
        }
    }

    public double getMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (double) (maxHeap.peek() + minHeap.peek())/2;
        } else if (maxHeap.size() > minHeap.size()){
            return (double)maxHeap.peek();
        } else {
            return (double) minHeap.peek();
        }
    }
}


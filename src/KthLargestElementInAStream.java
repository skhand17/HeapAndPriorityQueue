import java.util.PriorityQueue;

public class KthLargestElementInAStream {

    int k;
    final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        for (int n : nums)
            add(n);
    }

    public int add(int val) {
        if (priorityQueue.size() < k)
            priorityQueue.offer(val);
        else if (val > priorityQueue.peek()) {
            priorityQueue.poll();
            priorityQueue.add(val);
        }
        return priorityQueue.peek();
    }
}

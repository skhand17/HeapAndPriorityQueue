import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public static void main(String[] args) {
        int[] nums = new int[]{ 3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        int result = findKthLargest(nums, k);
        System.out.println(result);
    }

    public static int findKthLargest(int[] nums, int k) {

        /*
        * Created Max Heap since we need to find the kth largest element
        * */
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int n: nums)
            pq.offer(n);

        int i=1;
        while (i <= k-1){
            pq.poll();
            i++;
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}

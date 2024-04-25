import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {

        int[] stones = new int[] {2, 7, 4, 1, 8, 1};

        int weight = lastStoneWeight(stones);
        System.out.println(weight);
    }

    public static int lastStoneWeight(int[] stones) {

        /*
        * This is an example on how I can create a max heap
        *
        * */
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) ->Integer.compare(b, a));

        for(int s : stones){
            pq.offer(s);
        }

        while(pq.size() != 1){
            int largest = pq.poll();
            int secondLargest = pq.poll();

            if(largest != secondLargest){
                pq.offer(largest - secondLargest);
            }
        }

        return pq.poll();
    }
}

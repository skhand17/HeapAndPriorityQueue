import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        int[][] points = new int[][]{{3, 4}, {1, 2}, {5, 6},{2,3}};

        int[][] result = kClosest(points, 2);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static int[][] kClosest(int[][] points, int k) {
        /*
        *
        * This is how you create a priority queue with points
        * */
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->
                Integer.compare(
                        (a[0] * a[0] + a[1] * a[1]),
                        (b[0] * b[0] + b[1] * b[1])
                )
        );

        for(int[] point: points)
            q.offer(point);

        int[][]ans = new int[k][2];

        for(int i=0; i<k; i++){
            int[] cur = q.poll();
            ans[i][0] = cur[0];
            ans[i][1] = cur[1];
        }

        return ans;
    }
}

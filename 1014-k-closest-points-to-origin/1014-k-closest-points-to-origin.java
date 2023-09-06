class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        // Comparator to find the eucledian distance for each point(xi, yi)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((point1, point2) -> Integer.compare(computePointsDistance(point1), computePointsDistance(point2)));
        for(int [] point : points) {
            maxHeap.offer(point);
            // if(maxHeap.size() > k) {
            //     maxHeap.remove();
            // }
        }

        for(int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }
        return ans;
    }

    private int computePointsDistance(int [] distance) {
        return (int) (distance[0] * distance[0] + distance[1] * distance[1]);
    }
}
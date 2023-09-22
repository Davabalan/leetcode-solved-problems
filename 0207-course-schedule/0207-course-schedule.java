class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            graph.get(u).add(v);
        }

        int indegree[] = new int [numCourses];
        for(int i = 0; i < numCourses; i++) {
            for(int j : graph.get(i)) {
                indegree[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                q.offer(i);// q.add() and q.offer() are same?
             }
        }

        int count = 0;
        while(!q.isEmpty()) {
            int x = q.poll();
            count++;
            for(int j : graph.get(x)) {
                indegree[j]--;
                if(indegree[j] == 0) {
                    q.offer(j);
                }
            }
        }
        return count == graph.size();
    }
}
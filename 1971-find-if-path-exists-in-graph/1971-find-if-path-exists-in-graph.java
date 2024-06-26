class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++) graph.put(i,new ArrayList());
        
        for(int edge[]:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(graph,visited,source,destination);
        return found;
    }
    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int source,int destination){
        if(visited[source] || found) return;
        visited[source] = true;
        for(int nei: graph.get(source)){
            if(nei == destination){
                found=true;
                break;
            }
            if(!visited[nei]){
                dfs(graph,visited,nei,destination);
            }
        }
    }
}
public class GraphBFS{
    public static void main(String[] args){
        int vertices=6;
        int[][] adjMatrix=new int[vertices][vertices];
        addEdge(adjMatrix,0,1);
        addEdge(adjMatrix,0,2);
        addEdge(adjMatrix,1,3);
        addEdge(adjMatrix,1,4);
        addEdge(adjMatrix,2,5);
        System.out.println("BFS Traversal starting from vertex 0:");
        bfs(adjMatrix,0);
    }
    public static void addEdge(int[][] matrix,int source,int dest){
        if(source>=0&&source<matrix.length&&dest>=0&&dest<matrix.length){
            matrix[source][dest]=1;
            matrix[dest][source]=1;
        }
    }
    public static void bfs(int[][] matrix,int startVertex){
        if(matrix==null||matrix.length==0||startVertex<0||startVertex>=matrix.length){
            return;
        }
        int v=matrix.length;
        boolean[] visited=new boolean[v];
        int[] queue=new int[v];
        int head=0;
        int tail=0;
        visited[startVertex]=true;
        queue[tail++]=startVertex;
        while(head<tail){
            int current=queue[head++];
            System.out.print(current+" ");
            for(int i=0;i<v;i++){
                if(matrix[current][i]==1&&!visited[i]){
                    visited[i]=true;
                    queue[tail++]=i;
                }
            }
        }
        System.out.println();
    }
}

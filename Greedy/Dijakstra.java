package Greedy;
import java.util.*;
public class Dijakstra {
    static class Node implements Comparable<Node>{
        int dist;
        int node;
        Node(int dist,int node){
            this.dist = dist;
            this.node = node;
        }

        @Override 
        public int compareTo(Node other){
            if(this.dist==other.dist){
                return Integer.compare(this.node,other.node);
            }
            return Integer.compare(this.dist,other.dist);
        }
    }

    public static void dijakstra(int grid[][],int source){
        int n = grid.length;
        int dist[] = new int[n];
        boolean vis[] = new boolean[n];
        TreeSet<Node> set = new TreeSet<>();
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;
        set.add(new Node(dist[source],source));
        while(!set.isEmpty()){
            Node sk = set.removeFirst();
            if(vis[sk.node]){
                continue;
            }
            vis[sk.node] = true;
            for(int v = 0;v<n;v++){
                if(!vis[v] && grid[sk.node][v]!=0 && dist[sk.node]!=Integer.MAX_VALUE && dist[sk.node]+grid[sk.node][v]<dist[v] ){
                    set.remove(new Node(dist[v],v));
                    dist[v] = grid[sk.node][v] + dist[sk.node];
                    set.add(new Node(dist[v],v));
                }
            }
        }
    }
}

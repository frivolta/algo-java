package graph;

import util.structures.Graph;
import util.structures.Vertex;

import java.util.LinkedList;
import java.util.List;

public class Route {
    LinkedList<Vertex<Integer>> queue = new LinkedList<>();

    public boolean findPath(Graph<Vertex<Integer>> graph, Vertex startV, Vertex endV){
        queue.add(startV);
        while(!queue.isEmpty()){
            Vertex<Integer> current = queue.removeFirst();

            for(Vertex adjacent: graph.getAdjacent(current)){
                    if(adjacent == endV){
                        return true;
                    }
                    if(adjacent.visited==false){
                        queue.add(adjacent);
                    }
            }
            current.visited=true;
        }
        return false;
    }


}

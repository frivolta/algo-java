package util.structures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph <T>{
    // Hashmap to store the edges in the graph
    public Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T s){
        map.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional){
        if(!map.containsKey(source)){
            this.addVertex(source);
        }

        if(!map.containsKey(destination)){
            this.addVertex(destination);
        }

        map.get(source).add(destination);
        if(bidirectional){
            map.get(destination).add(source);
        }
    }

    public List<T> getAdjacent(T source){
        List<T> adjacent = map.get(source);
        return adjacent;
    }

    public List<T> getVertices(){
        List<T> vertices = new LinkedList<>();
        for(T v: this.map.keySet()){
            vertices.add(v);
        }
        return vertices;
    }

    public int getVertexCount(){
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
        return map.keySet().size();
    }

    public int getEdgesCount(boolean bidirection){
        int count = 0;
        for(T v: map.keySet()){
            count+=map.get(v).size();
        }
        if(bidirection){
            count = count / 2;
        }
        System.out.println("The graph has "
                + count
                + " edges.");
        return count;
    }

    public boolean hasVertex(T s) {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
            return true;
        } else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
            return false;
        }
    }

    public boolean hasEdge(T s, T d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between "
                    + s + " and " + d + ".");
            return true;
        }
        else {
            System.out.println("The graph has no edge between "
                    + s + " and " + d + ".");
            return false;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

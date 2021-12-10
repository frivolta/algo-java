package graph;

import org.jetbrains.annotations.Async;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.Graph;
import util.structures.Vertex;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class RouteTest {
    Graph<Vertex<Integer>> graph;

    @BeforeEach
    void setup(){
        this.graph = createDirectedGraph();
        displayGraph();
    }


    @Test
    void displayGraph(){
        System.out.println(this.graph.toString());
    }

    @Test
    @DisplayName("Should get adjacent of one vertex")
    void getAdjacentTest(){
        Vertex<Integer> vertex = findVertex(this.graph, 3);
        System.out.println(graph.getAdjacent(vertex));
    }

    @Test
    @DisplayName("Should get vertices")
    void getVerticesTest(){
        System.out.println(graph.getVertices());
    }

    @Test
    @DisplayName("Should return true if path is valid")
    void findPathTrueValue(){
        Route route = new Route();
        Vertex<Integer> startV = findVertex(this.graph, 1);
        Vertex<Integer> endV = findVertex(this.graph, 4);
        assertTrue(route.findPath(this.graph, startV, endV));
    }

    @Test
    @DisplayName("Should return false if path is invalid valid")
    void findPathFalseValue(){
        Route route = new Route();
        Vertex<Integer> startV = findVertex(this.graph, 3);
        Vertex<Integer> endV = findVertex(this.graph, 1);
        assertFalse(route.findPath(this.graph, startV, endV));
    }

    private Vertex<Integer> findVertex(Graph<Vertex<Integer>> g, Integer v){
        Vertex<Integer> vertex = new Vertex<>(1);
        for(Vertex<Integer> item: g.map.keySet()){
            if(item.value == v ){
                vertex = item;
            }
        }
        return vertex;
    }

    private Graph<Vertex<Integer>> createDirectedGraph(){
        graph = new Graph<>();
        ArrayList<Vertex<Integer>> vertices = new ArrayList<>();
        for(int i=0; i<8; i++){
            vertices.add(new Vertex<>(i));
        }

        graph.addEdge(vertices.get(6),vertices.get(1),false);
        graph.addEdge(vertices.get(1),vertices.get(2),false);
        graph.addEdge(vertices.get(2),vertices.get(5),false);
        graph.addEdge(vertices.get(5),vertices.get(3),false);
        graph.addEdge(vertices.get(3),vertices.get(2),false);
        graph.addEdge(vertices.get(3),vertices.get(4),false);
        graph.addEdge(vertices.get(4),vertices.get(7),false);
        return graph;
    }

}
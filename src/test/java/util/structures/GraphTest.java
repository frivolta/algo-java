package util.structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Graph<Integer> graph;

    @BeforeEach
    public void setup(){
      this.graph = new Graph<>();
        graph.addEdge(0, 1, true);
        graph.addEdge(0, 4, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(1, 4, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(3, 4, true);
    }

    @Test
    @DisplayName("Should create a graph")
    public void createGraphTest(){
        System.out.println("Graph:\n"
                + graph.toString());
        assertEquals(5, graph.getVertexCount());
        assertEquals(7, graph.getEdgesCount(true));
        assertEquals(true, graph.hasVertex(4));
        assertEquals(true, graph.hasEdge(0, 1));
    }
}
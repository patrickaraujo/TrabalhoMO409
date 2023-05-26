package org.example;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleGraphTest {

    @Test
    public void testAddNode() { // cria um grafo e adiciona um nó no grafo
        Graph graph = new SingleGraph("MyGraph");
        graph.addNode("A");
        assertEquals(1, graph.getNodeCount());
        assertEquals("A", graph.getNode("A").getId());
    }

    @Test
    public void testAddEdge() { //  cria um grafo, adiciona dois nós e uma aresta entre dois nós
        Graph graph = new SingleGraph("MyGraph");
        graph.addNode("A");
        graph.addNode("B");
        graph.addEdge("AB", "A", "B");
        assertEquals(2, graph.getNodeCount());
        assertEquals(1, graph.getEdgeCount());
        assertEquals("A", graph.getEdge("AB").getSourceNode().getId());
        //assertEquals("B", graph.getEdge("AB").getSourceNode().getId());
    }

    @Test
    public void testRemoveNode() {  //  Cria um grafo, adiciona um nó e depois remove um o nó
        Graph graph = new SingleGraph("test");
        graph.addNode("a");
        graph.removeNode("a");
        assertEquals(0, graph.getNodeCount());
    }

    @Test
    public void testRemoveEdge() {  // cria um novo grafo, adiciona dois nós e remove uma aresta
        Graph graph = new SingleGraph("test");
        graph.addNode("A");
        graph.addNode("B");
        graph.addEdge("AB", "A", "B");
        graph.removeEdge("A", "B");
        assertEquals(2, graph.getNodeCount());
        assertEquals(0, graph.getEdgeCount());
    }

}
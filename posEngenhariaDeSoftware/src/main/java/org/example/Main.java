package org.example;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a new SingleGraph instance
        Graph graph = new SingleGraph("MyGraph");

        // Add nodes
        Node nodeA = graph.addNode("A");
        Node nodeB = graph.addNode("B");
        Node nodeC = graph.addNode("C");

        // Add edges
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");

        // Set attributes
        nodeA.setAttribute("label", "Node A");
        nodeB.setAttribute("label", "Node B");
        nodeC.setAttribute("label", "Node C");

        // Display the graph
        graph.display();
    }
}
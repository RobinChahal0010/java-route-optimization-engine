package graph;

import java.util.*;

public class Graph {

    private final Map<String, List<Edge>> adjList =
            new HashMap<>();

    public void addCity(String city) {
        adjList.putIfAbsent(city, new ArrayList<>());
    }

    public void addRoad(String source,
                        String destination,
                        int weight) {

        addCity(source);
        addCity(destination);

        adjList.get(source)
                .add(new Edge(destination, weight));

        adjList.get(destination)
                .add(new Edge(source, weight));
    }
    public void removeRoad(String source,
                           String destination)

    public Map<String, List<Edge>> getAdjList() {
        return adjList;
    }

    public void displayGraph() {

        System.out.println("\n=== CITY NETWORK ===");

        for (String city : adjList.keySet()) {

            System.out.print(city + " -> ");

            for (Edge edge : adjList.get(city)) {

                System.out.print(
                        "[" + edge.getDestination()
                                + " : "
                                + edge.getWeight()
                                + "] "
                );
            }

            System.out.println();
        }
    }
}

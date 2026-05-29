package algorithms;

import graph.Edge;
import graph.Graph;
import graph.Node;
import java.util.*;
import models.PathResult;

public class Dijkstra {

    public static PathResult shortestPath(
            Graph graph,
            String start,
            String end) {

        Map<String, Integer> distance =
                new HashMap<>();

        Map<String, String> previous =
                new HashMap<>();

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                Node::getDistance
                        )
                );

        for (String city :
                graph.getAdjList().keySet()) {

            distance.put(city, Integer.MAX_VALUE);
        }

        distance.put(start, 0);

        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            for (Edge edge :
                    graph.getAdjList()
                            .get(current.getCity())) {

                int newDistance =
                        distance.get(current.getCity())
                                + edge.getWeight();

                if (newDistance <
                        distance.get(edge.getDestination())) {

                    distance.put(
                            edge.getDestination(),
                            newDistance
                    );

                    previous.put(
                            edge.getDestination(),
                            current.getCity()
                    );

                    pq.offer(
                            new Node(
                                    edge.getDestination(),
                                    newDistance
                            )
                    );
                }
            }
        }

        List<String> path = new ArrayList<>();

        String current = end;

        while (current != null) {

            path.add(current);

            current = previous.get(current);
        }

        Collections.reverse(path);

        return new PathResult(
                path,
                distance.get(end)
        );
    }
}
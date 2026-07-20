// main working l
package app;

import algorithms.Dijkstra;
import graph.Graph;
import models.PathResult;
import utils.ConsolePrinter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.println("=== NAVICORE ===");

        System.out.print(
                "\nEnter number of roads: "
        );

        int roads = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= roads; i++) {

            System.out.println(
                    "\nRoad " + i
            );

            System.out.print("Source City: ");
            String source = sc.nextLine();

            System.out.print("Destination City: ");
            String destination = sc.nextLine();

            System.out.print("Distance: ");
            int weight = sc.nextInt();
            sc.nextLine();

            graph.addRoad(
                    source,
                    destination,
                    weight
            );
        }

        graph.displayGraph();

        System.out.print(
                "\nStart City: "
        );

        String start = sc.nextLine();

        System.out.print(
                "End City: "
        );

        String end = sc.nextLine();

        PathResult result =
                Dijkstra.shortestPath(
                        graph,
                        start,
                        end
                );

        ConsolePrinter.printPath(result);

        sc.close();
    }
}

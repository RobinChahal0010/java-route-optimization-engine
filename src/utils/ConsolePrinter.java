package utils;

import models.PathResult;

public class ConsolePrinter {

    public static void printPath(PathResult result) {

        System.out.println("\n=== SHORTEST PATH ===");

        System.out.println(
                String.join(
                        " -> ",
                        result.getPath()
                )
        );

        System.out.println(
                "Total Distance: "
                        + result.getTotalDistance()
        );
    }
}
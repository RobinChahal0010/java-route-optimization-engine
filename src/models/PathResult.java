package models;

import java.util.List;

public class PathResult {

    private final List<String> path;
    private final int totalDistance;

    public PathResult(List<String> path,
                      int totalDistance) {

        this.path = path;
        this.totalDistance = totalDistance;
    }

    public List<String> getPath() {
        return path;
    }

    public int getTotalDistance() {
        return totalDistance;
    }
}
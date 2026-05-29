package graph;

public class Node {

    private final String city;
    private final int distance;

    public Node(String city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    public String getCity() {
        return city;
    }

    public int getDistance() {
        return distance;
    }
}
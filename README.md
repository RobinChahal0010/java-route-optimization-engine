# Java Route Optimization Engine

## Overview

Java Route Optimization Engine is a graph-based navigation and pathfinding system built using Java. The project simulates how modern navigation systems calculate optimal routes between cities using shortest path algorithms.

The engine currently uses Dijkstra’s Algorithm to compute the shortest route between two locations and is designed with a modular architecture for future scalability.

---

## Features

* Graph-based road network representation
* Dijkstra shortest path algorithm
* Dynamic road creation
* Weighted edges for distance calculation
* Clean modular package structure
* Console-based route interaction
* Path and distance output
* Scalable architecture for advanced routing systems

---

## Project Structure

```text
src/
│
├── algorithms/
│   └── Dijkstra.java
│
├── app/
│   └── Main.java
│
├── graph/
│   └── Graph.java
│
├── models/
│   └── PathResult.java
│
└── utils/
    └── ConsolePrinter.java
```

---

## Technologies Used

* Java
* Object-Oriented Programming
* Graph Theory
* Dijkstra Algorithm
* Priority Queue Concepts
* Data Structures

---

## How It Works

1. User creates a road network.
2. Cities are stored as graph nodes.
3. Roads are stored as weighted edges.
4. Dijkstra Algorithm calculates the shortest path.
5. Optimized route and total distance are displayed.

---

## Sample Execution

```text
=== NAVICORE ===

Enter number of roads: 4

Road 1
Source City: Delhi
Destination City: Chandigarh
Distance: 250

Road 2
Source City: Chandigarh
Destination City: Patiala
Distance: 70

Road 3
Source City: Delhi
Destination City: Jaipur
Distance: 280

Road 4
Source City: Jaipur
Destination City: Patiala
Distance: 400

Start City: Delhi
End City: Patiala

Shortest Path:
Delhi -> Chandigarh -> Patiala

Total Distance: 320
```

---

## Algorithm Used

### Dijkstra Algorithm

The system uses Dijkstra's Algorithm to compute the minimum distance between two nodes in a weighted graph.

### Time Complexity

```text
O((V + E) log V)
```

Where:

* V = Number of vertices
* E = Number of edges

---

## System Architecture

```text
User Input
    ↓
Graph Builder
    ↓
Road Network
    ↓
Dijkstra Engine
    ↓
Path Optimization
    ↓
Console Output
```

---

## Future Enhancements

* A* Pathfinding Algorithm
* Bellman-Ford Algorithm
* Traffic-aware routing
* Dynamic edge weights
* Road closure simulation
* Toll optimization
* Fuel cost estimation
* JavaFX visualization
* Spring Boot REST APIs
* Real-time route updates
* Multithreaded traffic simulation
* Route caching
* OpenStreetMap integration

---

## Why This Project?

This project was built to explore:

* Real-world applications of graph theory
* Optimization algorithms
* Backend system architecture
* Scalable Java application design
* Navigation engine concepts used in mapping systems

---

## Getting Started

### Clone Repository

```bash
git clone https://github.com/RobinChahal0010/java-route-optimization-engine.git
```

### Run Project

Compile and run the Main class:

```bash
javac app/Main.java
java app.Main
```

---

## Author

Robinpreet Singh Chahal

GitHub:
[https://github.com/RobinChahal0010](https://github.com/RobinChahal0010)

---

## License

This project is open-source and available under the MIT License.

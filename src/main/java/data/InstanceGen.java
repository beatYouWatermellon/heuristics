package data;

import util.Calculator;

import java.util.ArrayList;
import java.util.Random;

public class InstanceGen {
    private Random r = new Random();
    private int numCustomers;
    private int[] coordLimit = {
            100, 100
    };
    private int[] twLimit = {0, 1440};
    private ArrayList<Node> nodes = new ArrayList<>();

    public InstanceGen(int customerNumber) {
        numCustomers = customerNumber;
    }

    public void generate() {
        for (int i = 0; i < numCustomers + 1; i++) {
            double x = r.nextDouble() * coordLimit[0];
            double y = r.nextDouble() * coordLimit[1];
            double demand = r.nextDouble() * 100;
            if (i == 0) {
                demand = 0;
            }
            double etw = twLimit[0];
            double ltw = twLimit[1];
            Node n = new Node(i, x, y, demand, etw, ltw);
            nodes.add(n);
        }

        for (Node node1 : nodes) {
            for (Node node2 : nodes) {
                double dist = Calculator.CalDist(node1.getX(), node1.getY(), node2.getX(), node2.getY());
                node1.getDistFromMatrix().add(dist);
                node2.getDistToMatrix().add(dist);
            }
        }
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}



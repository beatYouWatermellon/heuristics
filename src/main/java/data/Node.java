package data;

import java.util.ArrayList;

public class Node {
    public int id;
    private double x;
    private double y;
    private double demand;
    private double etw;
    private double ltw;
    private ArrayList<Double> distFromMatrix;
    private ArrayList<Double> distToMatrix;

    public Node(int id, double x, double y, double demand, double etw, double ltw) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.demand = Math.round(demand);
        this.etw = etw;
        this.ltw = ltw;
        this.distFromMatrix = new ArrayList<>();
        this.distToMatrix = new ArrayList<>();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDemand() {
        return demand;
    }

    public double getEtw() {
        return etw;
    }

    public double getLtw() {
        return ltw;
    }

    public ArrayList<Double> getDistFromMatrix() {
        return distFromMatrix;
    }

    public ArrayList<Double> getDistToMatrix() {
        return distToMatrix;
    }
}

package randomSearch;

import data.Node;

import java.util.ArrayList;
import java.util.Collections;

class RandomSearch {
    Node[] search(int numIter, ArrayList<Node> nodes) {
        Node[] bestSol = new Node[100];
        double bestValue = Double.MAX_VALUE;
        for (int iter = 0; iter < numIter; iter++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 99; i++) {
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            Node[] sol = new Node[100];
            sol[0] = nodes.get(0);
            for (int i = 0; i < numbers.size(); i++) {
                sol[i + 1] = nodes.get(numbers.get(i) + 1);
            }
            double solValue = eval(sol);
            String info = String.format("iteration: %d, current value: %.2f, best value: %.2f", iter, solValue, bestValue);
            System.out.println(info);
            if (solValue < bestValue) {
                bestSol = sol;
                bestValue = solValue;
            }
        }
        return bestSol;
    }

    private double eval(Node[] sol) {
        if (sol.length == 0) {
            return Double.MAX_VALUE;
        }
        double cost = 0;
        for (int i = 0; i < sol.length - 1; i++) {
            cost += sol[i].getDistToMatrix().get(sol[i + 1].id);
        }
        return cost;
    }
}

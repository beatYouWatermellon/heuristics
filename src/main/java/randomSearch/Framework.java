package randomSearch;

import data.InstanceGen;
import data.Node;

import java.util.ArrayList;

public class Framework {
    public static void main(String[] args) {
        InstanceGen generator = new InstanceGen(99);
        generator.generate();
        ArrayList<Node> nodes = generator.getNodes();
//        for (Node node: nodes){
//            System.out.println(node.id);
//            System.out.println(node.getDemand());
//            System.out.println(node.getEtw());
//            System.out.println(node.getLtw());
//            System.out.println(node.getDistToMatrix());
//        }

        RandomSearch rs = new RandomSearch();
        Node[] bestSol = rs.search(200, nodes);
        for (Node node: bestSol){
            System.out.print(node.id);
            System.out.print("-");
        }
    }
}

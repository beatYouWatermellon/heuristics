package util;

public class Calculator {
    public static double CalDist(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));
    }
}

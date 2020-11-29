public final class Operation {
    public static double add(double a, double b){
        return a+b;
    }
    public static double minus(double a, double b){
        return a-b;
    }
    public static double multiple(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }
    public static double average(double ... a){
        double natija = 0;
        for(double x:a){
            natija += x;
        }
        return natija;
    }
}

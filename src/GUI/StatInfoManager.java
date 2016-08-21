
package GUI;


public class StatInfoManager {
    private static StatInfoManager SIM = new StatInfoManager();
    
    private int id = 0;
    private double squat = 0.0;
    private double benchpress = 0.0;
    private double deadlift = 0.0;
    private double weight = 0.0;
    private int date = 0;
    
        StatInfoManager(){}

    public static StatInfoManager getInstance() {
        return SIM;
    }

    public int getId() {
        return id;
    }

    public double getSquat() {
        return squat;
    }

    public double getBenchpress() {
        return benchpress;
    }

    public double getDeadlift() {
        return deadlift;
    }

    public double getWeight() {
        return weight;
    }

    public int getDate() {
        return date;
    }
    
    
    
    
}

public class CPU {
    private String model;
    private double clock;
    private int core;

    public CPU (String model, double clock, int core) {
        this.model = model;
        this.clock = clock;
        this.core = core;
    }

    public String getModel () {
        return this.model;
    }

    public int getCore () {
        return this.core;
    }

    public double getClock () {
        return this.clock;
    }
}

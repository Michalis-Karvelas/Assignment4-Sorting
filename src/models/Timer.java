package models;

public class Timer {
    private double startTime = 0;
    private double endTime = 0;

    public Timer() {
        this.start();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double elapsedTime() {
        return(endTime - startTime);
    }
}

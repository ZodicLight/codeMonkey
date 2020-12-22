package com.eyepoppy.state.abuse;

public class RunningState implements State {

    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch){//constructor
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopped");

    }
}

package com.eyepoppy.state.abuse;

public class Stopwatch {

    //private boolean isRunning;

    private State currentState = new StoppedState(this);//what is this this?

    public void click(){
//        if(isRunning){//I don't isRunning <- is true or false? Boolean practice
//            isRunning = false;
//            System.out.println("Stopped");
//        }else{
//            isRunning = true;
//            System.out.println("Running");
//        }
        currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

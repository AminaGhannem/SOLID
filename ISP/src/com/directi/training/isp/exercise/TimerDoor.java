package com.directi.training.isp.exercise;

public class TimerDoor implements ITimerDoor {
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimerDoor(Timer timer) {
        timer.register(TIME_OUT, this);
    }

    public void lock() {
        _locked = true;
    }

    public void unlock() {
        _locked = false;
    }

    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        _locked = true;
    }
}

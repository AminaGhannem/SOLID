package com.directi.training.isp.exercise;

public class SensorDoor implements ISensorDoor {

    private boolean _locked;
    private boolean _opened;

    public SensorDoor(Sensor sensor) {
        sensor.register(this);
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

    public void proximityCallback() {
        _opened = true;
    }
}

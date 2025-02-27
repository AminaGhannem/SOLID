package com.directi.training.ocp.exercise;

abstract class Slot {
    protected int id;

    public abstract boolean isFree();

    public abstract void markFree();

    public abstract void markBusy();
}

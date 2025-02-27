package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        IDuck normalDuck = new NormalDuck();
        ElectronicDuck electronicDuck = new ElectronicDuck();

        electronicDuck.turnOn();

        quack(normalDuck, electronicDuck);
        swim(normalDuck, electronicDuck);
    }

    private void quack(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(IDuck... ducks) {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}

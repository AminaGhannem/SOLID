package com.directi.training.ocp.exercise;

import java.util.List;

abstract class AbstractAllocator {
    protected List<Slot> slots;

    public void allocate(int id) {
        Slot freeSlot = findFree();
        if (freeSlot != null) {
            freeSlot.markBusy();
            System.out.println("Allocated a slot.");
        } else {
            System.out.println("No free slots available.");
        }
    }

    public void free(int id) {
        for (Slot slot : slots) {
            slot.markFree();
        }
        System.out.println("All slots freed.");
    }

    protected abstract Slot findFree();
}

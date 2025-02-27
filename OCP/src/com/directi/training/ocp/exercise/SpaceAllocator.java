package com.directi.training.ocp.exercise;

import java.util.ArrayList;
import java.util.List;

class SpaceAllocator extends AbstractAllocator {
    private List<SpaceSlot> spaceSlots;

    public SpaceAllocator(int numberOfSlots) {
        this.spaceSlots = new ArrayList<>();
        for (int i = 0; i < numberOfSlots; i++) {
            spaceSlots.add(new SpaceSlot());
        }
    }

    protected SpaceSlot findFree() {
        for (SpaceSlot slot : spaceSlots) {
            if (slot.isFree()) {
                return slot;
            }
        }
        return null;
    }

}

package com.directi.training.ocp.exercise;

import java.util.ArrayList;
import java.util.List;

class TimeAllocator extends AbstractAllocator {
    private List<TimeSlot> timeSlots;

    public TimeAllocator(int numberOfSlots) {
        this.timeSlots = new ArrayList<>();
        for (int i = 0; i < numberOfSlots; i++) {
            timeSlots.add(new TimeSlot());
        }
    }

    protected TimeSlot findFree() {
        for (TimeSlot slot : timeSlots) {
            if (slot.isFree()) {
                return slot;
            }
        }
        return null;
    }

}

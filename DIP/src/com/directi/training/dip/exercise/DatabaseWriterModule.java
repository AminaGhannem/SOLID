package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class DatabaseWriterModule implements IWritable {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    public void write(String data) {
        _data.put(++_count, data);
    }

    public void close() {
        // No closing operation needed
    }
}

package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterModule implements IWritable {
    private BufferedWriter writer;

    public FileWriterModule(String filePath) throws Exception {
        writer = new BufferedWriter(new FileWriter(filePath));
    }

    public void write(String data) throws Exception {
        writer.write(data);
    }

    public void close() throws Exception {
        writer.close();
    }
}

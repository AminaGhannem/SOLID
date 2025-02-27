package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderModule implements IReadable {
    private BufferedReader reader;

    public FileReaderModule(String filePath) throws Exception {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public String read() throws Exception {
        return reader.readLine();
    }

    public void close() throws Exception {
        reader.close();
    }
}

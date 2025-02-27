package com.directi.training.dip.exercise;

public interface IWritable {
    void write(String data) throws Exception;

    void close() throws Exception;
}

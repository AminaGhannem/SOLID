package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        Encoder encoder = new Encoder();

        IReadable fileReader = new FileReaderModule("beforeEncryption.txt");
        IWritable fileWriter = new FileWriterModule("afterEncryption.txt");
        encoder.encode(fileReader, fileWriter);

        IReadable networkReader = new NetworkReaderModule("http://myfirstappwith.appspot.com/index.html");
        IWritable dbWriter = new DatabaseWriterModule();
        encoder.encode(networkReader, dbWriter);
    }
}

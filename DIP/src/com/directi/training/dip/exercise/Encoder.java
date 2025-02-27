package com.directi.training.dip.exercise;

import java.util.Base64;

public class Encoder {
    public void encode(IReadable reader, IWritable writer) throws Exception {
        try {
            String input = reader.read();

            StringBuilder content = new StringBuilder();
            while (input != null) {
                content.append(input);
            }
            String encodedData = Base64.getEncoder().encodeToString(content.toString().getBytes());
            writer.write(encodedData);
        } finally {
            reader.close();
            writer.close();
        }
    }
}

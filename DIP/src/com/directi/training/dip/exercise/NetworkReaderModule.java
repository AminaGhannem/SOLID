package com.directi.training.dip.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderModule implements IReadable {
    private InputStreamReader reader;

    public NetworkReaderModule(String url) throws Exception {
        URL networkUrl = new URL(url);
        InputStream in = networkUrl.openStream();
        reader = new InputStreamReader(in);
    }

    public String read() throws Exception {
        int c = reader.read();
        if (c == -1) {
            return null;
        }
        return String.valueOf((char) c);
    }

    public void close() throws Exception {
        reader.close();
    }
}

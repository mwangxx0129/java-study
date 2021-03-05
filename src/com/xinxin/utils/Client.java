package com.xinxin.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Client {

    public static void main(String[] args) throws IOException {
        saveFile("/mnt/edisdocs/ibfengine-incoming", "c.txt", "hello".getBytes(StandardCharsets.UTF_8));
    }

    public static File saveFile(String workingDir, String fullName, byte[] data) throws IOException {
        File inFile = new File(workingDir + "/" + fullName);
        if (inFile.exists()) {
            return inFile;
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(inFile);
            fos.write(data);
        } catch (IOException ioe) {
            throw ioe;
        } finally {
            fos.close();
        }
        return inFile;

    }
}

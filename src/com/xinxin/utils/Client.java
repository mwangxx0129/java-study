package com.xinxin.utils;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        // 1. InputStream is abstract class  = com.xinxin.decorator.Item
        // 2. FileInputStream is a subclass of InputStream, = LongBlack Expresso
        // 3. FilterInputStream is a subclass of InputStream  = Decorator
        // 4. Data Input Stream is a subclass of Decorator = Milk
        // 5. FilterInputStream has `protected volatile InputStream in` = decorater
        // 6. Analyze the Decorator pattern in JDK io system
        DataInputStream dis = new DataInputStream(new FileInputStream("c:\\windows-version.txt"));
        System.out.println(dis.read());
        dis.close();
    }


}

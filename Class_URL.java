package javaapplication2;

import java.net.*;
import java.io.*;

public class Class_URL {

    public static void main(String[] args) throws Exception {
        URL url = new URL("www.google.com");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
    }
}

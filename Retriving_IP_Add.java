package javaapplication2;

import java.net.*;

public class Retriving_IP_Add {

    public static void main(String[] args) {
        InetAddress ob;
        ob = new InetAddress.getByName("www.google.com");
        System.out.println(ob.getHostAddress());
        byte[] arr = ob.getAddress();
        for (byte b : arr) {
            System.out.println(b);
        }
        System.out.println(ob.getHostName());
    }
}

package javaapplication2;

import java.net.*;
import java.io.*;

public class DownloadingImage {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.infoworld.com/article/2979739/java-101-classes-and-objects-in-java.html");
        FileOutputStream fout = new FileOutputStream("Pictures");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        int x;
        do {
            x = in.read();

            if (x != -1) {
                fout.write(x);
            }

        } while (x != -1);
        fout.close();
        System.out.println("File Saved");
    }
}

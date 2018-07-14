package com.andy.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * java9新特性IO
 *
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 10:08
 **/
public class IONews {

    private String CONTENT = "Hello World";

    private InputStream inputStream = IONews.class.getResourceAsStream("/module-info.java");

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\user.dta");
        try (inputStream) {
            byte[] bytes = inputStream.readAllBytes();
            for (int i = 0; i < bytes.length; i++) {
                System.out.print(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testReadAllBytes() throws Exception {
        final String content = new String(this.inputStream.readAllBytes());
        Objects.equals(CONTENT, content);
    }

    public void testReadNBytes() throws Exception {
        final byte[] data = new byte[5];
        this.inputStream.readNBytes(data, 0, 5);
        Objects.equals("Hello", new String(data));
    }

    public void testTransferTo() throws Exception {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        this.inputStream.transferTo(outputStream);
        Objects.equals(CONTENT, outputStream.toString());
    }
}

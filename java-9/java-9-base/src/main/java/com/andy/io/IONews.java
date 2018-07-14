package com.andy.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**java9新特性IO
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 10:08
 **/
public class IONews {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\user.dta");
        try (inputStream) {
            byte [] bytes = inputStream.readAllBytes();
            for (int i = 0; i < bytes.length; i++) {
                System.out.print(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

package com.spring.reader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author dada
 * @date 2019/11/2
 * @description
 */
public class ReaderTest {
    public static void main(String[] args) {

        ReaderTest poem = new ReaderTest();
        poem.getFile();
    }

    private void getFile() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            /**
             * getResource()方法会去classpath下找这个文件，获取到url resource, 得到这个资源后，调用url.getFile获取到 文件 的绝对路径
             */
            URL url = classLoader.getResource("test/test.txt");
            /**
             * url.getFile() 得到这个文件的绝对路径
             */
            System.out.println(url.getFile());
            File file = new File(url.getFile());
            System.out.println(file.exists());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

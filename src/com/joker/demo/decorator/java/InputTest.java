package com.joker.demo.decorator.java;

import java.io.*;

/**
 * @version 1.0.0
 * @ClassName InputTest.java
 * @Package com.joker.demo.decorator.java
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 10:18:00
 */
public class InputTest {
    public static void main(String[] args) {
        try {
            UpperCaseInputStream upperCaseInputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("E:\\Ideaprojects\\Demo\\DesignPatterns23\\src\\assets\\test.txt")));
            int c = 0;
            while ( (c = upperCaseInputStream.read()) >= 0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}

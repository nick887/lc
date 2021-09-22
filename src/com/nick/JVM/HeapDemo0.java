package com.nick.JVM;

/**
 * @author nick
 * @version 1.0, 2021/9/17
 * @since 1.0.0
 */
public class HeapDemo0 {
    // Xms10m Xmx10m
    public static void main(String[] args) {
        long l = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(l);
        long l1 = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println(l1);
    }
}

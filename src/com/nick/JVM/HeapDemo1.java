package com.nick.JVM;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author nick
 * @version 1.0, 2021/9/17
 * @since 1.0.0
 */
public class HeapDemo1 {
    int i;

    public HeapDemo1(int i) {
        this.i = i;
    }

    // -Xms20m -Xmx20m
    public static void main(String[] args) throws Exception {
        List<HeapDemo1> list =new ArrayList<>();
        while (true) {
            int r=new Random().nextInt();
            list.add(new HeapDemo1(r));
            System.out.println(r);
            Thread.sleep(1);
        }
    }
}

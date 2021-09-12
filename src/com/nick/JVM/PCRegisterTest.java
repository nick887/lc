package com.nick.JVM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/**
 * @author nick
 * @version 1.0, 2021/9/4
 * @since 1.0.0
 */
public class PCRegisterTest {

    public static void main(String[] args) {
        final long count = 10000000L;
        final long b = 5000000L;
        Long target = 0L;
        final int byteLength = 1024;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            long node = UUID.randomUUID().getMostSignificantBits()&Long.MAX_VALUE;
            if (i == b) {
                target = node;
            }
            set.add(node);
        }
        long start = System.currentTimeMillis();
        if (set.contains(target)) {
            System.out.println("yes");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        byte[] bloom = new byte[byteLength];
        for (int i = 0; i < count; i++) {
            long node = UUID.randomUUID().getMostSignificantBits()&Long.MAX_VALUE;
            if (i == b) {
                target = node;
            }
            bloom[hash_1(node)%byteLength] = 1;
            bloom[hash_2(node)%byteLength] = 1;
            bloom[hash_3(node)%byteLength] = 1;
        }
        start = System.currentTimeMillis();
        if (bloom[hash_3(target)%byteLength] == 1 &&
            bloom[hash_2(target)%byteLength] == 1 &&
            bloom[hash_1(target)%byteLength] == 1){
            System.out.println("yes");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int hash_1(long key) {
        int t = (int) key;
        t += t << 17;
        t += t << 20;
        t ^= t >> 3;
        t ^= t >> 10;
        t += t >> 24;
        return t;
    }

    public static int hash_2(long key) {
        int t = (int) key;
        t += t << 17;
        t ^= t >> 13;
        t += t << 20;
        t ^= t >> 10;
        t += t >> 14;
        return t;
    }

    public static int hash_3(long key) {
        int t = (int) key;
        t += t << 17;
        t ^= t >> 17;
        t += t << 20;
        t ^= t >> 10;
        t += t >> 10;
        return t;
    }

}

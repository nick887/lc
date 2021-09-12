package com.nick.test;

import org.junit.Test;

/**
 * @author nick
 * @version 1.0, 2021/8/11
 * @since 1.0.0
 */

public class Tests {
    @Test
    public void testOR(){
        System.out.println(1&2&3);
        System.out.println(3&2&1);
        if ((1|2|3) == (3|3|1)){
            System.out.println("yes");
        }
    }

    @Test
    public void testHash(){
        String a = "a";
        a.hashCode();
    }

}

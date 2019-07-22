package com.sankuai.concurrent;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        int cap = 15;
        int n = cap - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n >>> 1);
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        System.out.println((n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1);
    }


}

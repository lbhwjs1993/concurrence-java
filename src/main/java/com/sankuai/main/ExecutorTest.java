package com.sankuai.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();


        ExecutorService executorServiceSingleCache = Executors.newCachedThreadPool();



    }
}

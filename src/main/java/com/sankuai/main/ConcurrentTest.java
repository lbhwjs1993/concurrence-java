package com.sankuai.main;

import com.sankuai.AwaitSignalExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final AwaitSignalExample example = new AwaitSignalExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}

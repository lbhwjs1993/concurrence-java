package com.sankuai.guava;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;

import java.util.List;

public class TestImmutable {
    public static void main(String[] args) {
        build();
    }

    public static void build() {
        List<String> stringList = Lists.newArrayList();
        stringList.add("a");
        stringList.add("b");
        ImmutableSet<String> stringImmutableSet =
                ImmutableSet.<String>builder()
                        .addAll(stringList)
                        .add("c")
                        .add("b")
                        .build();
        System.out.println(stringImmutableSet); //[a, b, c]
        stringImmutableSet.add("o");
    }
}

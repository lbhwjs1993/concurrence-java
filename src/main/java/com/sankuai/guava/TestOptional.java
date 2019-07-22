package com.sankuai.guava;

import com.google.common.base.Optional;

import java.util.Arrays;
import java.util.List;

public class TestOptional {
    public static void main(String[] args) {
        //opitonal1();
        //optional2();
        //optional4();
        optional5();
    }

    public static void opitonal1() {
        Optional<Integer> possible = Optional.of(1);
        System.out.println("possible isPresent : " + possible.isPresent());
        System.out.println("possilble get : " + possible.get());
    }

    public static void optional2() {
        Optional<Integer> possible1 = Optional.absent();
        System.out.println("possible1 isPresent : " + possible1.isPresent());
        System.out.println("possible1 orNull : " + possible1.orNull());
        System.out.println("possible1 or : " + possible1.or(2));
        Optional<Integer> possible2 = Optional.fromNullable(3);
        System.out.println("possible2 isPresent : " + possible2.isPresent());
        System.out.println("possible2 get : " + possible2.get());
    }

    public static void optional3() {
        Optional<Integer> possible1 = Optional.absent();
        System.out.println("possible1 isPresent : " + possible1.isPresent());
        System.out.println("possible1 orNull : " + possible1.orNull());
        System.out.println("possible2 get : " + possible1.get());
    }

    public static void optional4() {
        Optional<Integer> possible1 = Optional.of(2);
        Optional<Integer> poss2 = Optional.absent();
        System.out.println(possible1.orNull());
        System.out.println(possible1.asSet());
        System.out.println(poss2.isPresent());
        System.out.println(poss2.asSet());
        System.out.println("possible1 isPresent : " + possible1.isPresent());
        System.out.println("possible1 orNull : " + possible1.orNull());
        System.out.println("possible2 get : " + possible1.get());
    }

    public static void optional5() {
        Optional<List<Integer>> possible1 = Optional.of(Arrays.asList(1,3,4));
        System.out.println(possible1.asSet());
        System.out.println(possible1.orNull());
    }
}

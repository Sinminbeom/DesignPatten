package com.study.DesignPatten._01_creational_patterns.builder.java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        Stream.Builder<String> stringStreamBuilder = Stream.builder();
//        Stream<String> names = stringStreamBuilder.add("minbeom").add("whiteship").build();
        Stream<String> names = Stream.<String>builder().add("minbeom").add("whiteship").build();

        names.forEach(System.out::println);
    }
}

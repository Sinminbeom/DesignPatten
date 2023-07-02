package com.study.DesignPatten._01_creational_patterns.builder.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("minbeom").toString();
        System.out.println("result = " + result);
    }


}

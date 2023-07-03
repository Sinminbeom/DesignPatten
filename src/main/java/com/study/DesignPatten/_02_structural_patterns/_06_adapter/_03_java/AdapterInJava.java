package com.study.DesignPatten._02_structural_patterns._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        // collections
        List<String> list = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> list1 = Collections.list(enumeration);

        // io
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)) {
            while(reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.study.DesignPatten._01_creational_patterns.singleton;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);

        /**
         * 싱글톤을 깨뜨리는 방법
         */

//        // 1. 리플렉션 사용하기
//        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException

//        Settings settings1 = Settings.getInstance();
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings2 = constructor.newInstance();
//
//        System.out.println(settings1 == settings2);

        // 2. 직렬화 & 역직렬화 사용하기(클래스에 Serializable를 상속받아야 한다)
        // throws IOException, ClassNotFoundException
//        Settings settings = Settings.getInstance();
//        Settings settings1 = null;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
//            out.writeObject(settings);
//        }
//
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
//            settings1 = (Settings) in.readObject();
//        }
//
//        System.out.println(settings == settings1);

        // enum은 리플렉션을 사용할 수 없어서 안전하다
//        EnumSettings settings1 = EnumSettings.INSTANCE;
//        EnumSettings settings2 = null;
//        Constructor<?>[] constructors = EnumSettings.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            constructor.setAccessible(true);
//            settings2 = (EnumSettings) constructor.newInstance("INSTANCE");
//        }
//
//        System.out.println(settings1 == settings2);

        // enum은 직렬화 & 역직렬화에서도 안전
//        EnumSettings settings = EnumSettings.INSTANCE;
//
//        EnumSettings settings1 = null;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
//            out.writeObject(settings);
//        }
//
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
//            settings1 = (EnumSettings) in.readObject();
//        }
//
//        System.out.println(settings == settings1);
    }


}

package com.study.DesignPatten.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    /**
     * 이렇게 구현할 경우 멀티 쓰레드 환경에서 안전하지 않다
     * 하나의 쓰레드가 하나의 인스턴스를 만들기전에 다른 쓰레드가 if문을 타게되면 두개의 쓰레드 모두 Settings 인스턴스를 만들게됨
     * 안전하게 만드는 방법이 있는데
     *
     * 1. getInstance메소드에 synchronized 키워드 사용
     *     private static Settings instance;
     *
     *     public static synchronized Settings getInstance() {
     *         if (instance == null) {
     *             instance = new Settings();
     *         }
     *         return instance;
     *     }
     *
     * 2. private static final Settings INSTANCE = new Settings();
     *     private static final Settings INSTANCE = new Settings();
     *
     *     public static synchronized Settings getInstance() {
     *         return INSTANCE;
     *     }
     *
     * 3. double checked locking 사용(메소드에 synchronized 키워드를 사용하는것보다 성능이 효율적이다)
     *
     *  장점 : 자기가 만들고 싶을 때 인스턴스를 만들 수 있다. 그리고 모든 쓰레드가 synchronized 키워드로 인해 lock이 일어나지 않아서 장점이다.
     *     private static volatile Settings instance;
     *
     *     public static Settings getInstance() {
     *         if (instance == null) {
     *             instance = new Settings();
     *             synchronized (Settings.class) {
     *                 if (instance == null) {
     *                     instance = new Settings();
     *                 }
     *             }
     *         }
     *         return instance;
     *     }
     *
     * 4. static inner 클래스 사용하기 (권장하는 방법중 하나)
     *
     *     private static class SettingsHolder {
     *         private static final Settings INSTANCE = new Settings();
     *     }
     *
     *     public static Settings getInstance() {
     *         return SettingsHolder.INSTANCE;
     *     }
     */

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 할때 해당 readResolve메소드가 있으면 무조건 실행된다.
    // 해당 메소드를 추가함으로써 직렬화 & 역직렬화했을 경우 싱글톤이 깨지는 것을 막을 수 있다.
    protected Object readResolve() {
        return getInstance();
    }
}

package com.study.DesignPatten._03_behavioral_patterns._19_observer._02_after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("minbeom");
        User user2 = new User("subin");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user2);
        
        chatServer.sendMessage(user1, "오징어게임", "아..... 이름이 기억났어 오일남");
        chatServer.sendMessage(user2, "디자인패턴", "크 잼있다.");
    }
}

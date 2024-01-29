package com.study.DesignPatten._02_structural_patterns._10_Facade._02_after;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
//        String to = "keesun@whiteship.me";
//        String from = "whiteship@whiteship.me";
//        String host = "127.0.0.1";
//
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", host);
//
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("Test Mail from Java Program");
//            message.setText("message");
//
//            Transport.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("minbeom");
        emailMessage.setTo("shinminbeom");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고...");
        emailSender.sendEmail(emailMessage);
    }
}

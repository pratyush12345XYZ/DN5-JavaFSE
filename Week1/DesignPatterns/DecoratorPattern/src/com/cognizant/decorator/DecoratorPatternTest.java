package com.cognizant.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Notification:");
        notifier.send("System Update Available");

        System.out.println();

        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification:");
        smsNotifier.send("System Update Available");

        System.out.println();

        Notifier multiChannelNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");
        multiChannelNotifier.send("System Update Available");
    }
}
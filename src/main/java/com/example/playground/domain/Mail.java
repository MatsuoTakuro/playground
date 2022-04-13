package com.example.playground.domain;

public class Mail {

    String readStatus() {
        if (isUnread()) return "Unread";

        return "";
    }

    boolean isUnread() {
        return true;
    }
}

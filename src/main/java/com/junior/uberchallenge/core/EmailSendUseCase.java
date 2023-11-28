package com.junior.uberchallenge.core;

public interface EmailSendUseCase {
    void sendEmail(String to, String subject, String body);
}

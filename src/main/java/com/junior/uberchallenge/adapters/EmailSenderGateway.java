package com.junior.uberchallenge.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);

}

package com.junior.uberchallenge.application;

import com.junior.uberchallenge.adapters.EmailSenderGateway;
import com.junior.uberchallenge.core.EmailSendUseCase;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSendUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

    }

}

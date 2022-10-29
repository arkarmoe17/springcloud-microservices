package com.example.notificationservice.service;

import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    public void sendEmail(String orderNumber){
        System.out.println("Order placed successfully - order number:"+orderNumber);
        System.out.println("Email sent.");
    }
}

package com.example.notificationservice;

import com.example.notificationservice.service.EmailSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;


@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @Bean
    public Consumer<Message<String>> notificationEventSupplier() {
        log.info("notification event is received.");
        return message -> new EmailSender().sendEmail(message.getPayload());
    }

}

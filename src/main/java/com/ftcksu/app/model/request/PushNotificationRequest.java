package com.ftcksu.app.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PushNotificationRequest {

    private String title;
    private String message;
    private String topic;
    private String token;
    private List<String> tokens;

    public PushNotificationRequest(String title, String message, String token) {
        this.title = title;
        this.message = message;
        this.token = token;
    }

    public PushNotificationRequest(String title, String message, List<String> tokens) {
        this.title = title;
        this.message = message;
        this.tokens = tokens;
    }

    public PushNotificationRequest(String title, List<String> tokens) {
        this.title = title;
        this.message = "نزلت فعالية جديدة تعال شفها";
        this.tokens = tokens;
    }
}

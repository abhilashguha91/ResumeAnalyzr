package com.ai.practice.resumeAnalyzr.model;

import java.util.List;

public class CohereRequest {
    private boolean stream;
    private String model;
    private List<ChatMessage> messages;

    // Getters and setters
    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }
}

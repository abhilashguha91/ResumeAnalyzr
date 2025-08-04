package com.ai.practice.resumeAnalyzr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ai.practice.resumeAnalyzr.model.CohereRequest;
import com.ai.practice.resumeAnalyzr.service.CohereChatService;

@RestController
@RequestMapping("/resumeAnalyzr")
public class CohereChatController {

    private final CohereChatService cohereChatService;

    public CohereChatController(CohereChatService cohereChatService) {
        this.cohereChatService = cohereChatService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody CohereRequest request) {
        return cohereChatService.chatWithCohere(request);
    }
}

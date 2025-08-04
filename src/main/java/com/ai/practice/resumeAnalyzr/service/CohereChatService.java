package com.ai.practice.resumeAnalyzr.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ai.practice.resumeAnalyzr.model.CohereRequest;

@Service
public class CohereChatService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String apiUrl = "https://api.cohere.com/v2/chat";

    public CohereChatService(RestTemplate restTemplate, @Value("${cohere.api.key:gT7GJnWxu64M6dWaGR7IxM79WyFW2Bf01n0xJUAZ}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public String chatWithCohere(CohereRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CohereRequest> entity = new HttpEntity<>(request, headers);

        return restTemplate.postForObject(apiUrl, entity, String.class);
    }
}

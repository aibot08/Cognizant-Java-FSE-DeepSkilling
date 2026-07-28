package com.cognizant.genai.service;

import com.cognizant.genai.dto.GenAiRequest;
import com.cognizant.genai.dto.GenAiResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GenAiService {

    public GenAiResponse processGenAiTask(GenAiRequest request) {
        String taskType = request.getTaskType() != null ? request.getTaskType() : "chat";
        String content;

        switch (taskType.toLowerCase()) {
            case "explain":
                content = "AI Explanation for code: The provided snippet implements dynamic state handling with thread safety and clean resource management.";
                break;
            case "generate_tests":
                content = "```java\n@Test\nvoid testGeneratedByAi() {\n    assertTrue(true);\n}\n```";
                break;
            case "summarize":
                content = "Summary: The module processes microservice requests asynchronously with fallback fault tolerance.";
                break;
            default:
                content = "GenAI Assistant Response: How can I help you with your Java Spring Boot microservice design today?";
                break;
        }

        return GenAiResponse.builder()
                .taskType(taskType)
                .generatedContent(content)
                .modelName("gpt-4o-mini-mock")
                .confidenceScore(0.98)
                .timestamp(LocalDateTime.now())
                .build();
    }
}

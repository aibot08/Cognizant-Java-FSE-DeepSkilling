package com.cognizant.genai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenAiResponse {

    private String taskType;
    private String generatedContent;
    private String modelName;
    private double confidenceScore;
    private LocalDateTime timestamp;
}

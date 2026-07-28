package com.cognizant.genai.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenAiRequest {

    @NotBlank(message = "Prompt or code snippet cannot be blank")
    private String prompt;

    private String language;
    private String taskType; // "explain", "generate_tests", "summarize", "chat"
}

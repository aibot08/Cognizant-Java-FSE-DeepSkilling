package com.cognizant.genai;

import com.cognizant.genai.controller.GenAiController;
import com.cognizant.genai.dto.GenAiRequest;
import com.cognizant.genai.dto.GenAiResponse;
import com.cognizant.genai.service.GenAiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GenAiController.class)
class GenAiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GenAiService genAiService;

    @Test
    void testHealthCheckEndpoint() throws Exception {
        mockMvc.perform(get("/api/genai/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("GenAI Service is active and running."));
    }

    @Test
    void testProcessTaskEndpoint() throws Exception {
        GenAiResponse mockResponse = GenAiResponse.builder()
                .taskType("explain")
                .generatedContent("Mock AI Content")
                .confidenceScore(0.99)
                .build();

        when(genAiService.processGenAiTask(any(GenAiRequest.class))).thenReturn(mockResponse);

        String jsonPayload = """
                {
                    "prompt": "Explain public static void main",
                    "taskType": "explain"
                }
                """;

        mockMvc.perform(post("/api/genai/process")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonPayload))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.taskType").value("explain"))
                .andExpect(jsonPath("$.generatedContent").value("Mock AI Content"));
    }
}

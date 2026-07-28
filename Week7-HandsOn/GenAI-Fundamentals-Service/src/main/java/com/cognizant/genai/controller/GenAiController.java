package com.cognizant.genai.controller;

import com.cognizant.genai.dto.GenAiRequest;
import com.cognizant.genai.dto.GenAiResponse;
import com.cognizant.genai.service.GenAiService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genai")
@CrossOrigin(origins = "*")
public class GenAiController {

    private final GenAiService genAiService;

    public GenAiController(GenAiService genAiService) {
        this.genAiService = genAiService;
    }

    @PostMapping("/process")
    public ResponseEntity<GenAiResponse> processTask(@Valid @RequestBody GenAiRequest request) {
        GenAiResponse response = genAiService.processGenAiTask(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("GenAI Service is active and running.");
    }
}

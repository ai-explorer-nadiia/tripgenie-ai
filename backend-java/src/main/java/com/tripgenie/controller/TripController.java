package com.tripgenie.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/trip")
public class TripController {

    @PostMapping("/generate")
    public ResponseEntity<String> generateTrip(@RequestBody String preferencesJson) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python3", "../ai-module-python/ai_core.py");
            Process process = pb.start();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            writer.write(preferencesJson);
            writer.flush();
            writer.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return ResponseEntity.ok(output.toString());
            } else {
                return ResponseEntity.status(500).body("AI module error");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Exception: " + e.getMessage());
        }
    }
}

package com.popov.controllers;

import com.popov.service.IndexingService;
import com.popov.service.responses.ResponseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class IndexingController {

    private final IndexingService index;

    public IndexingController(IndexingService index) {
        this.index = index;
    }

    @GetMapping("/startIndexing")
    public ResponseEntity<Object> startIndexingAll() {
        ResponseService response = index.startIndexingAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/stopIndexing")
    public ResponseEntity<Object> stopIndexingAll() {
        ResponseService response = index.stopIndexing();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/indexPage")
    public ResponseEntity<Object> startIndexingOne(
            @RequestParam(name="url", required=false, defaultValue=" ") String url) {
        ResponseService response = index.startIndexingOne(url);
        return ResponseEntity.ok(response);
    }
}

package dev.server.controller;

import dev.server.dto.ContentDto;
import dev.server.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;


    @GetMapping
    public String welcome() {
        return "The server is UP!";
    }


    @GetMapping("messages")
    public ResponseEntity<List<ContentDto>> getMessages() {
        return ResponseEntity.ok(contentService.getMessages());
    }


    @PostMapping("messages")
    public ResponseEntity<ContentDto> createMessage(@RequestBody ContentDto contentDto) {
        return ResponseEntity.ok(contentService.createMessage(contentDto));
    }

}

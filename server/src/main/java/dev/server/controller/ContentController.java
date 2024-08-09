package dev.server.controller;

import dev.server.dto.ContentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {


    @GetMapping
    public String welcome() {
        return "Hello world";
    }


    @GetMapping("messages")
    public ResponseEntity<List<ContentDto>> getMessages() {
        return null;
    }


    @PostMapping("messages")
    public ResponseEntity<ContentDto> createMessage(@RequestBody ContentDto contentDto) {
        return null;
    }

}

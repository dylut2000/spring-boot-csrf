package dev.server.service;

import dev.server.dto.ContentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private List<ContentDto> messages = new ArrayList<>( List.of(
            new ContentDto("Hello everyone"),
            new ContentDto("Hi...")
    ));

    public List<ContentDto> getMessages() {
        return messages;
    }


    public ContentDto createMessage(ContentDto contentDto) {
        messages.add(contentDto);
        return contentDto;
    }
}
